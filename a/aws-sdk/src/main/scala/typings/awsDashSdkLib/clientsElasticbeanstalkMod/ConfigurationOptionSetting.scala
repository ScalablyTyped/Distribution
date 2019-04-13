package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptionSetting extends js.Object {
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.undefined
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
  /**
    * A unique resource name for a time-based scaling configuration option.
    */
  var ResourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The current value for the configuration option.
    */
  var Value: js.UndefOr[ConfigurationOptionValue] = js.undefined
}

object ConfigurationOptionSetting {
  @scala.inline
  def apply(
    Namespace: OptionNamespace = null,
    OptionName: ConfigurationOptionName = null,
    ResourceName: ResourceName = null,
    Value: ConfigurationOptionValue = null
  ): ConfigurationOptionSetting = {
    val __obj = js.Dynamic.literal()
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (OptionName != null) __obj.updateDynamic("OptionName")(OptionName)
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ConfigurationOptionSetting]
  }
}

