package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.EMAIL
import typings.awsLambda.awsLambdaStrings.RESEND
import typings.awsLambda.awsLambdaStrings.SMS
import typings.awsLambda.awsLambdaStrings.SUPPRESS
import typings.awsLambda.commonMod.StringMap
import typings.awsLambda.userMigrationMod.UserStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesiredDeliveryMediums extends StObject {
  
  var desiredDeliveryMediums: js.Array[SMS | EMAIL]
  
  var finalUserStatus: js.UndefOr[UserStatus] = js.undefined
  
  var forceAliasCreation: js.UndefOr[Boolean] = js.undefined
  
  var messageAction: js.UndefOr[RESEND | SUPPRESS] = js.undefined
  
  var userAttributes: StringMap
}
object DesiredDeliveryMediums {
  
  inline def apply(desiredDeliveryMediums: js.Array[SMS | EMAIL], userAttributes: StringMap): DesiredDeliveryMediums = {
    val __obj = js.Dynamic.literal(desiredDeliveryMediums = desiredDeliveryMediums.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredDeliveryMediums]
  }
  
  extension [Self <: DesiredDeliveryMediums](x: Self) {
    
    inline def setDesiredDeliveryMediums(value: js.Array[SMS | EMAIL]): Self = StObject.set(x, "desiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    inline def setDesiredDeliveryMediumsVarargs(value: (SMS | EMAIL)*): Self = StObject.set(x, "desiredDeliveryMediums", js.Array(value*))
    
    inline def setFinalUserStatus(value: UserStatus): Self = StObject.set(x, "finalUserStatus", value.asInstanceOf[js.Any])
    
    inline def setFinalUserStatusUndefined: Self = StObject.set(x, "finalUserStatus", js.undefined)
    
    inline def setForceAliasCreation(value: Boolean): Self = StObject.set(x, "forceAliasCreation", value.asInstanceOf[js.Any])
    
    inline def setForceAliasCreationUndefined: Self = StObject.set(x, "forceAliasCreation", js.undefined)
    
    inline def setMessageAction(value: RESEND | SUPPRESS): Self = StObject.set(x, "messageAction", value.asInstanceOf[js.Any])
    
    inline def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
