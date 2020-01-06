package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionConfigurationRequest extends js.Object {
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: typings.awsDashSdk.clientsConfigserviceMod.RetentionPeriodInDays = js.native
}

object PutRetentionConfigurationRequest {
  @scala.inline
  def apply(RetentionPeriodInDays: RetentionPeriodInDays): PutRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionPeriodInDays = RetentionPeriodInDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRetentionConfigurationRequest]
  }
}

