package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DevicesAndroidApp extends StObject {
  
  /**
    * Package name
    * Package name must be specified when specifing Android Fulfillment.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple filters are specified, any filter match will trigger the app.
    */
  var versions: js.UndefOr[js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter]] = js.undefined
}
object GoogleActionsV2DevicesAndroidApp {
  
  @scala.inline
  def apply(): GoogleActionsV2DevicesAndroidApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidApp]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DevicesAndroidAppMutableBuilder[Self <: GoogleActionsV2DevicesAndroidApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: GoogleActionsV2DevicesAndroidAppVersionFilter*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
