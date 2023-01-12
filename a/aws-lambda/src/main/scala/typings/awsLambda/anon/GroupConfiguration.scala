package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import typings.awsLambda.triggerCognitoUserPoolTriggerPreTokenGenerationMod.GroupOverrideDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupConfiguration extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var groupConfiguration: GroupOverrideDetails
  
  var userAttributes: StringMap
}
object GroupConfiguration {
  
  inline def apply(groupConfiguration: GroupOverrideDetails, userAttributes: StringMap): GroupConfiguration = {
    val __obj = js.Dynamic.literal(groupConfiguration = groupConfiguration.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupConfiguration] (val x: Self) extends AnyVal {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setGroupConfiguration(value: GroupOverrideDetails): Self = StObject.set(x, "groupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
