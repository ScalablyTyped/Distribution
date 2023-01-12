package typings.activexLibreoffice.com_.sun.star.deployment

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface provide an URL to the root of an installed package.
  * @since OOo 2.3
  */
trait XPackageInformationProvider extends StObject {
  
  /** returns a list of all installed extension with their version. */
  val ExtensionList: SafeArray[SafeArray[String]]
  
  /** returns a list of all installed extension with their version. */
  def getExtensionList(): SafeArray[SafeArray[String]]
  
  /**
    * get Package information for a specific extension.
    * @param extensionId the unique identifier of an extension. The service looks for an installed package with the given id and returns the URL to the root o
    */
  def getPackageLocation(extensionId: String): String
  
  /**
    * check if there are updates available for an extension.
    * @param extensionId the unique identifier of an extension. When the extensionId is empty, the service looks checks all installed extensions for a newer v
    */
  def isUpdateAvailable(extensionId: String): SafeArray[SafeArray[String]]
}
object XPackageInformationProvider {
  
  inline def apply(
    ExtensionList: SafeArray[SafeArray[String]],
    getExtensionList: () => SafeArray[SafeArray[String]],
    getPackageLocation: String => String,
    isUpdateAvailable: String => SafeArray[SafeArray[String]]
  ): XPackageInformationProvider = {
    val __obj = js.Dynamic.literal(ExtensionList = ExtensionList.asInstanceOf[js.Any], getExtensionList = js.Any.fromFunction0(getExtensionList), getPackageLocation = js.Any.fromFunction1(getPackageLocation), isUpdateAvailable = js.Any.fromFunction1(isUpdateAvailable))
    __obj.asInstanceOf[XPackageInformationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPackageInformationProvider] (val x: Self) extends AnyVal {
    
    inline def setExtensionList(value: SafeArray[SafeArray[String]]): Self = StObject.set(x, "ExtensionList", value.asInstanceOf[js.Any])
    
    inline def setGetExtensionList(value: () => SafeArray[SafeArray[String]]): Self = StObject.set(x, "getExtensionList", js.Any.fromFunction0(value))
    
    inline def setGetPackageLocation(value: String => String): Self = StObject.set(x, "getPackageLocation", js.Any.fromFunction1(value))
    
    inline def setIsUpdateAvailable(value: String => SafeArray[SafeArray[String]]): Self = StObject.set(x, "isUpdateAvailable", js.Any.fromFunction1(value))
  }
}
