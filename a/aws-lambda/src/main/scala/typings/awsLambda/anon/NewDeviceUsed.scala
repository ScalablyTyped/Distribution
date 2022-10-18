package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewDeviceUsed extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var newDeviceUsed: Boolean
  
  var userAttributes: StringMap
}
object NewDeviceUsed {
  
  inline def apply(newDeviceUsed: Boolean, userAttributes: StringMap): NewDeviceUsed = {
    val __obj = js.Dynamic.literal(newDeviceUsed = newDeviceUsed.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDeviceUsed]
  }
  
  extension [Self <: NewDeviceUsed](x: Self) {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setNewDeviceUsed(value: Boolean): Self = StObject.set(x, "newDeviceUsed", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
