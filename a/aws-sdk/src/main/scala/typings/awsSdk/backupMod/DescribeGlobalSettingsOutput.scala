package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalSettingsOutput extends StObject {
  
  /**
    * A list of resources along with the opt-in preferences for the account.
    */
  var GlobalSettings: js.UndefOr[typings.awsSdk.backupMod.GlobalSettings] = js.native
  
  /**
    * The date and time that the global settings was last updated. This update is in Unix format and Coordinated Universal Time (UTC). The value of LastUpdateTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastUpdateTime: js.UndefOr[timestamp] = js.native
}
object DescribeGlobalSettingsOutput {
  
  @scala.inline
  def apply(): DescribeGlobalSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalSettingsOutput]
  }
  
  @scala.inline
  implicit class DescribeGlobalSettingsOutputMutableBuilder[Self <: DescribeGlobalSettingsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSettings(value: GlobalSettings): Self = StObject.set(x, "GlobalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSettingsUndefined: Self = StObject.set(x, "GlobalSettings", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: timestamp): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
  }
}
