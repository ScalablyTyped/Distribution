package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to create remediation exception.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName = js.native
  /**
    * The exception is automatically deleted after the expiration date.
    */
  var ExpirationTime: js.UndefOr[_Date] = js.native
  /**
    * The message contains an explanation of the exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys = js.native
}

object PutRemediationExceptionsRequest {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    ResourceKeys: RemediationExceptionResourceKeys,
    ExpirationTime: _Date = null,
    Message: StringWithCharLimit1024 = null
  ): PutRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationExceptionsRequest]
  }
}

