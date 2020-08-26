package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to import the document properties from OOXML format */
@js.native
trait XOOXMLDocumentPropertiesImporter extends XInterface {
  /**
    * allows to import the document properties from OOXML format
    *
    * The implementation should parse the document properties from OOXML format storage and set them to the target {@link XDocumentProperties}
    * implementation.
    *
    * The storage must represent OOXML format and support {@link com.sun.star.embed.XRelationshipAccess} interface. Please see {@link
    * com.sun.star.embed.StorageFactory} for details regarding creation of such a storage.
    * @param xSource the source storage representing OOXML document
    * @param xDocumentProperties the target {@link XDocumentProperties} interface implementation
    * @throws com::sun::star::lang::IllegalArgumentException the exception is thrown in case unexpected arguments are provided
    * @throws com::sun::star::xml::sax::SAXException the exception is thrown in case of parsing problems
    * @throws com::sun::star::uno::Exception the exception is thrown in case of other problems during the import
    */
  def importProperties(xSource: XStorage, xDocumentProperties: XDocumentProperties): Unit = js.native
}

object XOOXMLDocumentPropertiesImporter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    importProperties: (XStorage, XDocumentProperties) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XOOXMLDocumentPropertiesImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), importProperties = js.Any.fromFunction2(importProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XOOXMLDocumentPropertiesImporter]
  }
  @scala.inline
  implicit class XOOXMLDocumentPropertiesImporterOps[Self <: XOOXMLDocumentPropertiesImporter] (val x: Self) extends AnyVal {
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
    def setImportProperties(value: (XStorage, XDocumentProperties) => Unit): Self = this.set("importProperties", js.Any.fromFunction2(value))
  }
  
}

