package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationResponse extends js.Object {
  /**
    * Configuration ID of an application to be created.
    */
  var configurationId: js.UndefOr[String] = js.undefined
}

object CreateApplicationResponse {
  @scala.inline
  def apply(configurationId: String = null): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId)
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

