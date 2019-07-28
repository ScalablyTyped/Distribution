package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationSetRequest extends js.Object {
  /**
    * A list of configuration set attributes to return.
    */
  var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.undefined
  /**
    * The name of the configuration set to describe.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName
}

object DescribeConfigurationSetRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    ConfigurationSetAttributeNames: ConfigurationSetAttributeList = null
  ): DescribeConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
    if (ConfigurationSetAttributeNames != null) __obj.updateDynamic("ConfigurationSetAttributeNames")(ConfigurationSetAttributeNames)
    __obj.asInstanceOf[DescribeConfigurationSetRequest]
  }
}

