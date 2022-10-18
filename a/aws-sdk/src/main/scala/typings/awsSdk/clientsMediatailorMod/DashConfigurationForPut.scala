package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashConfigurationForPut extends StObject {
  
  /**
    * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates the Location tag with the URL for manifest update requests, to be used by players that don't support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value.
    */
  var MpdLocation: js.UndefOr[string] = js.undefined
  
  /**
    * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
    */
  var OriginManifestType: js.UndefOr[typings.awsSdk.clientsMediatailorMod.OriginManifestType] = js.undefined
}
object DashConfigurationForPut {
  
  inline def apply(): DashConfigurationForPut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashConfigurationForPut]
  }
  
  extension [Self <: DashConfigurationForPut](x: Self) {
    
    inline def setMpdLocation(value: string): Self = StObject.set(x, "MpdLocation", value.asInstanceOf[js.Any])
    
    inline def setMpdLocationUndefined: Self = StObject.set(x, "MpdLocation", js.undefined)
    
    inline def setOriginManifestType(value: OriginManifestType): Self = StObject.set(x, "OriginManifestType", value.asInstanceOf[js.Any])
    
    inline def setOriginManifestTypeUndefined: Self = StObject.set(x, "OriginManifestType", js.undefined)
  }
}
