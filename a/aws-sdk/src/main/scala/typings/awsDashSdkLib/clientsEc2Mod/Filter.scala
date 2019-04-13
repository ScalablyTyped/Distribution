package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * One or more filter values. Filter values are case-sensitive.
    */
  var Values: js.UndefOr[ValueStringList] = js.undefined
}

object Filter {
  @scala.inline
  def apply(Name: String = null, Values: ValueStringList = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Filter]
  }
}

