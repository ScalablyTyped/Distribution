package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalSettingsOutput extends js.Object {
  
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
  implicit class DescribeGlobalSettingsOutputOps[Self <: DescribeGlobalSettingsOutput] (val x: Self) extends AnyVal {
    
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
    def setGlobalSettings(value: GlobalSettings): Self = this.set("GlobalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSettings: Self = this.set("GlobalSettings", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: timestamp): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
  }
}
