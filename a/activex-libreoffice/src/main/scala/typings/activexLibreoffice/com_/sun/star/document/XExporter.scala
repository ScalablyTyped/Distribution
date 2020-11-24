package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to connect a document with an {@link ExportFilter}
  *
  * An {@link ExportFilter} must know the source of its filter operation. To set this on a filter is part of this interface. Same mechanism exist for
  * import too.
  * @see ExportFilter
  * @see ImportFilter
  * @see XImporter
  */
@js.native
trait XExporter extends XInterface {
  
  /**
    * sets the source document for the exporter
    * @param Document the source document
    * @throws com::sun::star::lang::IllegalArgumentException if **Document** does not support any service which is supported by this exporter
    */
  def setSourceDocument(Document: XComponent): Unit = js.native
}
object XExporter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSourceDocument: XComponent => Unit
  ): XExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
    __obj.asInstanceOf[XExporter]
  }
  
  @scala.inline
  implicit class XExporterOps[Self <: XExporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetSourceDocument(value: XComponent => Unit): Self = this.set("setSourceDocument", js.Any.fromFunction1(value))
  }
}
