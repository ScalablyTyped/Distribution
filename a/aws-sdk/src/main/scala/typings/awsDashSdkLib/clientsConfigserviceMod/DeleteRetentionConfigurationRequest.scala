package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRetentionConfigurationRequest extends js.Object {
  /**
    * The name of the retention configuration to delete.
    */
  var RetentionConfigurationName: awsDashSdkLib.clientsConfigserviceMod.RetentionConfigurationName
}

object DeleteRetentionConfigurationRequest {
  @scala.inline
  def apply(RetentionConfigurationName: RetentionConfigurationName): DeleteRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionConfigurationName = RetentionConfigurationName)
  
    __obj.asInstanceOf[DeleteRetentionConfigurationRequest]
  }
}

