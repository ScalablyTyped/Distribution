package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRegionSettingsOutput extends js.Object {
  
  /**
    * Returns a list of all services along with the opt-in preferences in the Region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.backupMod.ResourceTypeOptInPreference] = js.native
}
object DescribeRegionSettingsOutput {
  
  @scala.inline
  def apply(): DescribeRegionSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionSettingsOutput]
  }
  
  @scala.inline
  implicit class DescribeRegionSettingsOutputOps[Self <: DescribeRegionSettingsOutput] (val x: Self) extends AnyVal {
    
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
    def setResourceTypeOptInPreference(value: ResourceTypeOptInPreference): Self = this.set("ResourceTypeOptInPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypeOptInPreference: Self = this.set("ResourceTypeOptInPreference", js.undefined)
  }
}
