package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonInfo extends StObject {
  
  /**
    * The name of the add-on.
    */
  var addonName: js.UndefOr[String] = js.undefined
  
  /**
    * An object representing information about available add-on versions and compatible Kubernetes versions.
    */
  var addonVersions: js.UndefOr[AddonVersionInfoList] = js.undefined
  
  /**
    * The type of the add-on.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AddonInfo {
  
  inline def apply(): AddonInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonInfo]
  }
  
  extension [Self <: AddonInfo](x: Self) {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonNameUndefined: Self = StObject.set(x, "addonName", js.undefined)
    
    inline def setAddonVersions(value: AddonVersionInfoList): Self = StObject.set(x, "addonVersions", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionsUndefined: Self = StObject.set(x, "addonVersions", js.undefined)
    
    inline def setAddonVersionsVarargs(value: AddonVersionInfo*): Self = StObject.set(x, "addonVersions", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
