package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRevisionRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: __string
  /**
    * The revision of the configuration.
    */
  var ConfigurationRevision: __string
}

object DescribeConfigurationRevisionRequest {
  @scala.inline
  def apply(ConfigurationId: __string, ConfigurationRevision: __string): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId, ConfigurationRevision = ConfigurationRevision)
  
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
}

