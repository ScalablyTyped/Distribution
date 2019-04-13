package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurations extends js.Object {
  /**
    * The current configuration of the broker.
    */
  var Current: js.UndefOr[ConfigurationId] = js.undefined
  /**
    * The history of configurations applied to the broker.
    */
  var History: js.UndefOr[__listOfConfigurationId] = js.undefined
  /**
    * The pending configuration of the broker.
    */
  var Pending: js.UndefOr[ConfigurationId] = js.undefined
}

object Configurations {
  @scala.inline
  def apply(
    Current: ConfigurationId = null,
    History: __listOfConfigurationId = null,
    Pending: ConfigurationId = null
  ): Configurations = {
    val __obj = js.Dynamic.literal()
    if (Current != null) __obj.updateDynamic("Current")(Current)
    if (History != null) __obj.updateDynamic("History")(History)
    if (Pending != null) __obj.updateDynamic("Pending")(Pending)
    __obj.asInstanceOf[Configurations]
  }
}

