package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMappingRequest extends js.Object {
  /**
    * Parameters for the mapping.
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Location] = js.native
  /**
    * A list of target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.native
  /**
    * Specifies the source table.
    */
  var Source: CatalogEntry = js.native
}

object GetMappingRequest {
  @scala.inline
  def apply(Source: CatalogEntry, Location: Location = null, Sinks: CatalogEntries = null): GetMappingRequest = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Sinks != null) __obj.updateDynamic("Sinks")(Sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingRequest]
  }
}

