package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionSpecification extends js.Object {
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
  var ResourceName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ResourceName] = js.undefined
}

object OptionSpecification {
  @scala.inline
  def apply(
    Namespace: OptionNamespace = null,
    OptionName: ConfigurationOptionName = null,
    ResourceName: ResourceName = null
  ): OptionSpecification = {
    val __obj = js.Dynamic.literal()
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (OptionName != null) __obj.updateDynamic("OptionName")(OptionName)
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName)
    __obj.asInstanceOf[OptionSpecification]
  }
}

