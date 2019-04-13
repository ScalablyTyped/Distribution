package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * When you're using a List operation and you want the operation to return a subset of objects, such as resolver endpoints or resolver rules, the name of the parameter that you want to use to filter objects. For example, to list only inbound resolver endpoints, specify Direction for the value of Name.
    */
  var Name: js.UndefOr[FilterName] = js.undefined
  /**
    * When you're using a List operation and you want the operation to return a subset of objects, such as resolver endpoints or resolver rules, the value of the parameter that you want to use to filter objects. For example, to list only inbound resolver endpoints, specify INBOUND for the value of Values.
    */
  var Values: js.UndefOr[FilterValues] = js.undefined
}

object Filter {
  @scala.inline
  def apply(Name: FilterName = null, Values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Filter]
  }
}

