package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionConfiguration extends js.Object {
  /**
    * The name of the retention configuration object.
    */
  var Name: RetentionConfigurationName
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: awsDashSdkLib.clientsConfigserviceMod.RetentionPeriodInDays
}

object RetentionConfiguration {
  @scala.inline
  def apply(Name: RetentionConfigurationName, RetentionPeriodInDays: RetentionPeriodInDays): RetentionConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name, RetentionPeriodInDays = RetentionPeriodInDays)
  
    __obj.asInstanceOf[RetentionConfiguration]
  }
}

