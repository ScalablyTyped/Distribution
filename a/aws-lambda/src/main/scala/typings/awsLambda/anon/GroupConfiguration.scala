package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import typings.awsLambda.preTokenGenerationMod.GroupOverrideDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfiguration extends js.Object {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var groupConfiguration: GroupOverrideDetails = js.native
  
  var userAttributes: StringMap = js.native
}
object GroupConfiguration {
  
  @scala.inline
  def apply(groupConfiguration: GroupOverrideDetails, userAttributes: StringMap): GroupConfiguration = {
    val __obj = js.Dynamic.literal(groupConfiguration = groupConfiguration.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConfiguration]
  }
  
  @scala.inline
  implicit class GroupConfigurationOps[Self <: GroupConfiguration] (val x: Self) extends AnyVal {
    
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
    def setGroupConfiguration(value: GroupOverrideDetails): Self = this.set("groupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
  }
}
