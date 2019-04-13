package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMappingRequest extends js.Object {
  /**
    * Parameters for the mapping.
    */
  var Location: js.UndefOr[Location] = js.undefined
  /**
    * A list of target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.undefined
  /**
    * Specifies the source table.
    */
  var Source: CatalogEntry
}

object GetMappingRequest {
  @scala.inline
  def apply(Source: CatalogEntry, Location: Location = null, Sinks: CatalogEntries = null): GetMappingRequest = {
    val __obj = js.Dynamic.literal(Source = Source)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Sinks != null) __obj.updateDynamic("Sinks")(Sinks)
    __obj.asInstanceOf[GetMappingRequest]
  }
}

