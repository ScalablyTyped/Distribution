package typings.activexLibreoffice.com_.sun.star.deployment

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface provide an URL to the root of an installed package.
  * @since OOo 2.3
  */
@js.native
trait XPackageInformationProvider extends js.Object {
  
  /** returns a list of all installed extension with their version. */
  val ExtensionList: SafeArray[SafeArray[String]] = js.native
  
  /** returns a list of all installed extension with their version. */
  def getExtensionList(): SafeArray[SafeArray[String]] = js.native
  
  /**
    * get Package information for a specific extension.
    * @param extensionId the unique identifier of an extension. The service looks for an installed package with the given id and returns the URL to the root o
    */
  def getPackageLocation(extensionId: String): String = js.native
  
  /**
    * check if there are updates available for an extension.
    * @param extensionId the unique identifier of an extension. When the extensionId is empty, the service looks checks all installed extensions for a newer v
    */
  def isUpdateAvailable(extensionId: String): SafeArray[SafeArray[String]] = js.native
}
object XPackageInformationProvider {
  
  @scala.inline
  def apply(
    ExtensionList: SafeArray[SafeArray[String]],
    getExtensionList: () => SafeArray[SafeArray[String]],
    getPackageLocation: String => String,
    isUpdateAvailable: String => SafeArray[SafeArray[String]]
  ): XPackageInformationProvider = {
    val __obj = js.Dynamic.literal(ExtensionList = ExtensionList.asInstanceOf[js.Any], getExtensionList = js.Any.fromFunction0(getExtensionList), getPackageLocation = js.Any.fromFunction1(getPackageLocation), isUpdateAvailable = js.Any.fromFunction1(isUpdateAvailable))
    __obj.asInstanceOf[XPackageInformationProvider]
  }
  
  @scala.inline
  implicit class XPackageInformationProviderOps[Self <: XPackageInformationProvider] (val x: Self) extends AnyVal {
    
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
    def setExtensionList(value: SafeArray[SafeArray[String]]): Self = this.set("ExtensionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtensionList(value: () => SafeArray[SafeArray[String]]): Self = this.set("getExtensionList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPackageLocation(value: String => String): Self = this.set("getPackageLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsUpdateAvailable(value: String => SafeArray[SafeArray[String]]): Self = this.set("isUpdateAvailable", js.Any.fromFunction1(value))
  }
}
