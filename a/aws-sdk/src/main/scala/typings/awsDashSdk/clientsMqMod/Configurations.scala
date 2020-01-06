package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurations extends js.Object {
  /**
    * The current configuration of the broker.
    */
  var Current: js.UndefOr[ConfigurationId] = js.native
  /**
    * The history of configurations applied to the broker.
    */
  var History: js.UndefOr[__listOfConfigurationId] = js.native
  /**
    * The pending configuration of the broker.
    */
  var Pending: js.UndefOr[ConfigurationId] = js.native
}

object Configurations {
  @scala.inline
  def apply(
    Current: ConfigurationId = null,
    History: __listOfConfigurationId = null,
    Pending: ConfigurationId = null
  ): Configurations = {
    val __obj = js.Dynamic.literal()
    if (Current != null) __obj.updateDynamic("Current")(Current.asInstanceOf[js.Any])
    if (History != null) __obj.updateDynamic("History")(History.asInstanceOf[js.Any])
    if (Pending != null) __obj.updateDynamic("Pending")(Pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurations]
  }
}

