package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NielsenWatermarksSettings extends StObject {
  
  /**
    * Complete these fields only if you want to insert watermarks of type Nielsen CBET
    */
  var NielsenCbetSettings: js.UndefOr[NielsenCBET] = js.undefined
  
  /**
    * Choose the distribution types that you want to assign to the watermarks:
  - PROGRAM_CONTENT
  - FINAL_DISTRIBUTOR
    */
  var NielsenDistributionType: js.UndefOr[NielsenWatermarksDistributionTypes] = js.undefined
  
  /**
    * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES VI (NW).
    */
  var NielsenNaesIiNwSettings: js.UndefOr[NielsenNaesIiNw] = js.undefined
}
object NielsenWatermarksSettings {
  
  inline def apply(): NielsenWatermarksSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenWatermarksSettings]
  }
  
  extension [Self <: NielsenWatermarksSettings](x: Self) {
    
    inline def setNielsenCbetSettings(value: NielsenCBET): Self = StObject.set(x, "NielsenCbetSettings", value.asInstanceOf[js.Any])
    
    inline def setNielsenCbetSettingsUndefined: Self = StObject.set(x, "NielsenCbetSettings", js.undefined)
    
    inline def setNielsenDistributionType(value: NielsenWatermarksDistributionTypes): Self = StObject.set(x, "NielsenDistributionType", value.asInstanceOf[js.Any])
    
    inline def setNielsenDistributionTypeUndefined: Self = StObject.set(x, "NielsenDistributionType", js.undefined)
    
    inline def setNielsenNaesIiNwSettings(value: NielsenNaesIiNw): Self = StObject.set(x, "NielsenNaesIiNwSettings", value.asInstanceOf[js.Any])
    
    inline def setNielsenNaesIiNwSettingsUndefined: Self = StObject.set(x, "NielsenNaesIiNwSettings", js.undefined)
  }
}
