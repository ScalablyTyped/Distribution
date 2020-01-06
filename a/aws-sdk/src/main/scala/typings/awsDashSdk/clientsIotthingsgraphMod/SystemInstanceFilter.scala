package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceFilter extends js.Object {
  /**
    * The name of the search filter field.
    */
  var name: js.UndefOr[SystemInstanceFilterName] = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search. 
    */
  var value: js.UndefOr[SystemInstanceFilterValues] = js.native
}

object SystemInstanceFilter {
  @scala.inline
  def apply(name: SystemInstanceFilterName = null, value: SystemInstanceFilterValues = null): SystemInstanceFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInstanceFilter]
  }
}

