package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlanRequest extends js.Object {
  /**
    * The programming language of the code to perform the mapping.
    */
  var Language: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Language] = js.undefined
  /**
    * The parameters for the mapping.
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Location] = js.undefined
  /**
    * The list of mappings from a source table to target tables.
    */
  var Mapping: MappingList
  /**
    * The target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.undefined
  /**
    * The source table.
    */
  var Source: CatalogEntry
}

object GetPlanRequest {
  @scala.inline
  def apply(
    Mapping: MappingList,
    Source: CatalogEntry,
    Language: Language = null,
    Location: Location = null,
    Sinks: CatalogEntries = null
  ): GetPlanRequest = {
    val __obj = js.Dynamic.literal(Mapping = Mapping, Source = Source)
    if (Language != null) __obj.updateDynamic("Language")(Language.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Sinks != null) __obj.updateDynamic("Sinks")(Sinks)
    __obj.asInstanceOf[GetPlanRequest]
  }
}

