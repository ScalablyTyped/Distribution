package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to convert file system folder tree in to a package. */
@js.native
trait XPackageStructureCreator extends XInterface {
  
  /**
    * converts file system folder tree in to a package.
    * @param sFolderURL the URL of folder that must be converted, the URL must be in format accepted by UCB
    * @param xTargetStream the result package will be written into this stream
    * @throws com::sun::star::io::IOException in case any problem on reading/writing appears
    */
  def convertToPackage(sFolderURL: String, xTargetStream: XOutputStream): Unit = js.native
}
object XPackageStructureCreator {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertToPackage: (String, XOutputStream) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPackageStructureCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertToPackage = js.Any.fromFunction2(convertToPackage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPackageStructureCreator]
  }
  
  @scala.inline
  implicit class XPackageStructureCreatorOps[Self <: XPackageStructureCreator] (val x: Self) extends AnyVal {
    
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
    def setConvertToPackage(value: (String, XOutputStream) => Unit): Self = this.set("convertToPackage", js.Any.fromFunction2(value))
  }
}
