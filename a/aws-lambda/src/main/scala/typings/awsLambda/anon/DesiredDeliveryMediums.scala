package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.EMAIL
import typings.awsLambda.awsLambdaStrings.RESEND
import typings.awsLambda.awsLambdaStrings.SMS
import typings.awsLambda.awsLambdaStrings.SUPPRESS
import typings.awsLambda.commonMod.StringMap
import typings.awsLambda.userMigrationMod.UserStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesiredDeliveryMediums extends js.Object {
  
  var desiredDeliveryMediums: js.Array[SMS | EMAIL] = js.native
  
  var finalUserStatus: js.UndefOr[UserStatus] = js.native
  
  var forceAliasCreation: js.UndefOr[Boolean] = js.native
  
  var messageAction: js.UndefOr[RESEND | SUPPRESS] = js.native
  
  var userAttributes: StringMap = js.native
}
object DesiredDeliveryMediums {
  
  @scala.inline
  def apply(desiredDeliveryMediums: js.Array[SMS | EMAIL], userAttributes: StringMap): DesiredDeliveryMediums = {
    val __obj = js.Dynamic.literal(desiredDeliveryMediums = desiredDeliveryMediums.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredDeliveryMediums]
  }
  
  @scala.inline
  implicit class DesiredDeliveryMediumsOps[Self <: DesiredDeliveryMediums] (val x: Self) extends AnyVal {
    
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
    def setDesiredDeliveryMediumsVarargs(value: (SMS | EMAIL)*): Self = this.set("desiredDeliveryMediums", js.Array(value :_*))
    
    @scala.inline
    def setDesiredDeliveryMediums(value: js.Array[SMS | EMAIL]): Self = this.set("desiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUserStatus(value: UserStatus): Self = this.set("finalUserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalUserStatus: Self = this.set("finalUserStatus", js.undefined)
    
    @scala.inline
    def setForceAliasCreation(value: Boolean): Self = this.set("forceAliasCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAliasCreation: Self = this.set("forceAliasCreation", js.undefined)
    
    @scala.inline
    def setMessageAction(value: RESEND | SUPPRESS): Self = this.set("messageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAction: Self = this.set("messageAction", js.undefined)
  }
}
