package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoveredResource extends js.Object {
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the on-premise resource.
    */
  var ConfigurationId: typings.awsDashSdk.clientsMigrationhubMod.ConfigurationId = js.native
  /**
    * A description that can be free-form text to record additional detail about the discovered resource for clarity or later reference.
    */
  var Description: js.UndefOr[DiscoveredResourceDescription] = js.native
}

object DiscoveredResource {
  @scala.inline
  def apply(ConfigurationId: ConfigurationId, Description: DiscoveredResourceDescription = null): DiscoveredResource = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveredResource]
  }
}

