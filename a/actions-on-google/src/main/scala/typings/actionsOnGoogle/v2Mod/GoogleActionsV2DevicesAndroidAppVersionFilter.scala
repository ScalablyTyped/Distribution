package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DevicesAndroidAppVersionFilter extends StObject {
  
  /**
    * Max version code, inclusive.
    * The range considered is [min_version:max_version].
    * A null range implies any version.
    * Examples:
    * To specify a single version use: [target_version:target_version].
    * To specify any version leave min_version and max_version unspecified.
    * To specify all versions until max_version, leave min_version unspecified.
    * To specify all versions from min_version, leave max_version unspecified.
    */
  var maxVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Min version code or 0, inclusive.
    */
  var minVersion: js.UndefOr[Double] = js.undefined
}
object GoogleActionsV2DevicesAndroidAppVersionFilter {
  
  inline def apply(): GoogleActionsV2DevicesAndroidAppVersionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidAppVersionFilter]
  }
  
  extension [Self <: GoogleActionsV2DevicesAndroidAppVersionFilter](x: Self) {
    
    inline def setMaxVersion(value: Double): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    inline def setMinVersion(value: Double): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
  }
}
