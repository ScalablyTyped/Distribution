package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterStringFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: ParameterStringFilterKey
  /**
    * Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
    */
  var Option: js.UndefOr[ParameterStringQueryOption] = js.undefined
  /**
    * The value you want to search for.
    */
  var Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined
}

object ParameterStringFilter {
  @scala.inline
  def apply(
    Key: ParameterStringFilterKey,
    Option: ParameterStringQueryOption = null,
    Values: ParameterStringFilterValueList = null
  ): ParameterStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (Option != null) __obj.updateDynamic("Option")(Option)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[ParameterStringFilter]
  }
}

