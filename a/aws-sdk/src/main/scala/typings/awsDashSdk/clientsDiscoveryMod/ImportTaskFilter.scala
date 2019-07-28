package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportTaskFilter extends js.Object {
  /**
    * The name, status, or import task ID for a specific import task.
    */
  var name: js.UndefOr[ImportTaskFilterName] = js.undefined
  /**
    * An array of strings that you can provide to match against a specific name, status, or import task ID to filter the results for your import task queries.
    */
  var values: js.UndefOr[ImportTaskFilterValueList] = js.undefined
}

object ImportTaskFilter {
  @scala.inline
  def apply(name: ImportTaskFilterName = null, values: ImportTaskFilterValueList = null): ImportTaskFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ImportTaskFilter]
  }
}

