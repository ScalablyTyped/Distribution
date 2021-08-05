package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalSettingsOutput extends StObject {
  
  /**
    * A list of resources along with the opt-in preferences for the account.
    */
  var GlobalSettings: js.UndefOr[typings.awsSdk.backupMod.GlobalSettings] = js.undefined
  
  /**
    * The date and time that the global settings was last updated. This update is in Unix format and Coordinated Universal Time (UTC). The value of LastUpdateTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastUpdateTime: js.UndefOr[timestamp] = js.undefined
}
object DescribeGlobalSettingsOutput {
  
  inline def apply(): DescribeGlobalSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalSettingsOutput]
  }
  
  extension [Self <: DescribeGlobalSettingsOutput](x: Self) {
    
    inline def setGlobalSettings(value: GlobalSettings): Self = StObject.set(x, "GlobalSettings", value.asInstanceOf[js.Any])
    
    inline def setGlobalSettingsUndefined: Self = StObject.set(x, "GlobalSettings", js.undefined)
    
    inline def setLastUpdateTime(value: timestamp): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
  }
}
