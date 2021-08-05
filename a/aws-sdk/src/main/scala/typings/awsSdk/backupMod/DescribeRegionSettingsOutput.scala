package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegionSettingsOutput extends StObject {
  
  /**
    * Returns a list of all services along with the opt-in preferences in the Region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.backupMod.ResourceTypeOptInPreference] = js.undefined
}
object DescribeRegionSettingsOutput {
  
  inline def apply(): DescribeRegionSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionSettingsOutput]
  }
  
  extension [Self <: DescribeRegionSettingsOutput](x: Self) {
    
    inline def setResourceTypeOptInPreference(value: ResourceTypeOptInPreference): Self = StObject.set(x, "ResourceTypeOptInPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeOptInPreferenceUndefined: Self = StObject.set(x, "ResourceTypeOptInPreference", js.undefined)
  }
}
