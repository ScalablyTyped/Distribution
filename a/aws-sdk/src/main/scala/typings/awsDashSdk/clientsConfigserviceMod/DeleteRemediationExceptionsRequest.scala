package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to delete remediation exception configuration.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys
}

object DeleteRemediationExceptionsRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: RemediationExceptionResourceKeys): DeleteRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName, ResourceKeys = ResourceKeys)
  
    __obj.asInstanceOf[DeleteRemediationExceptionsRequest]
  }
}

