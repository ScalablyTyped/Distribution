package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import typings.awsLambda.preTokenGenerationMod.GroupOverrideDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfiguration extends StObject {
  
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
  implicit class GroupConfigurationMutableBuilder[Self <: GroupConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setGroupConfiguration(value: GroupOverrideDetails): Self = StObject.set(x, "groupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
