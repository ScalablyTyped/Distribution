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
  
  inline def apply(): GoogleActionsV2DevicesAndroidApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidApp]
  }
  
  extension [Self <: GoogleActionsV2DevicesAndroidApp](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setVersions(value: js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: GoogleActionsV2DevicesAndroidAppVersionFilter*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
