package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to convert file system folder tree in to a package. */
trait XPackageStructureCreator
  extends StObject
     with XInterface {
  
  /**
    * converts file system folder tree in to a package.
    * @param sFolderURL the URL of folder that must be converted, the URL must be in format accepted by UCB
    * @param xTargetStream the result package will be written into this stream
    * @throws com::sun::star::io::IOException in case any problem on reading/writing appears
    */
  def convertToPackage(sFolderURL: String, xTargetStream: XOutputStream): Unit
}
object XPackageStructureCreator {
  
  inline def apply(
    acquire: () => Unit,
    convertToPackage: (String, XOutputStream) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPackageStructureCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertToPackage = js.Any.fromFunction2(convertToPackage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPackageStructureCreator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPackageStructureCreator] (val x: Self) extends AnyVal {
    
    inline def setConvertToPackage(value: (String, XOutputStream) => Unit): Self = StObject.set(x, "convertToPackage", js.Any.fromFunction2(value))
  }
}
