package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsConfigurationType extends js.Object {
  /**
    * The external ID.
    */
  var ExternalId: js.UndefOr[StringType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
    */
  var SnsCallerArn: ArnType
}

object SmsConfigurationType {
  @scala.inline
  def apply(SnsCallerArn: ArnType, ExternalId: StringType = null): SmsConfigurationType = {
    val __obj = js.Dynamic.literal(SnsCallerArn = SnsCallerArn)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    __obj.asInstanceOf[SmsConfigurationType]
  }
}

