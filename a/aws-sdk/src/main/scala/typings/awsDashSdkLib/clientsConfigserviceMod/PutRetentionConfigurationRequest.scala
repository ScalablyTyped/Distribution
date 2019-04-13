package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRetentionConfigurationRequest extends js.Object {
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: awsDashSdkLib.clientsConfigserviceMod.RetentionPeriodInDays
}

object PutRetentionConfigurationRequest {
  @scala.inline
  def apply(RetentionPeriodInDays: RetentionPeriodInDays): PutRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionPeriodInDays = RetentionPeriodInDays)
  
    __obj.asInstanceOf[PutRetentionConfigurationRequest]
  }
}

