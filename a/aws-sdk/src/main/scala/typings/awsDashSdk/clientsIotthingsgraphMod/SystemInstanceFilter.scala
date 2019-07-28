package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemInstanceFilter extends js.Object {
  /**
    * The name of the search filter field.
    */
  var name: js.UndefOr[SystemInstanceFilterName] = js.undefined
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search. 
    */
  var value: js.UndefOr[SystemInstanceFilterValues] = js.undefined
}

object SystemInstanceFilter {
  @scala.inline
  def apply(name: SystemInstanceFilterName = null, value: SystemInstanceFilterValues = null): SystemInstanceFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SystemInstanceFilter]
  }
}

