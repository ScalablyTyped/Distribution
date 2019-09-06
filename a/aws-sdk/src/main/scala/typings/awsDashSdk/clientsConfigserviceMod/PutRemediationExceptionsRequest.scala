package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to create remediation exception.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * The exception is automatically deleted after the expiration date.
    */
  var ExpirationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The message contains an explanation of the exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys
}

object PutRemediationExceptionsRequest {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    ResourceKeys: RemediationExceptionResourceKeys,
    ExpirationTime: _Date = null,
    Message: StringWithCharLimit1024 = null
  ): PutRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName, ResourceKeys = ResourceKeys)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[PutRemediationExceptionsRequest]
  }
}

