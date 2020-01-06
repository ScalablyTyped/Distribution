package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterStringFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: ParameterStringFilterKey = js.native
  /**
    * For all filters used with DescribeParameters, valid options include Equals and BeginsWith. The Name filter additionally supports the Contains option. (Exception: For filters using the key Path, valid options include Recursive and OneLevel.) For filters used with GetParametersByPath, valid options include Equals and BeginsWith. (Exception: For filters using the key Label, the only valid option is Equals.)
    */
  var Option: js.UndefOr[ParameterStringQueryOption] = js.native
  /**
    * The value you want to search for.
    */
  var Values: js.UndefOr[ParameterStringFilterValueList] = js.native
}

object ParameterStringFilter {
  @scala.inline
  def apply(
    Key: ParameterStringFilterKey,
    Option: ParameterStringQueryOption = null,
    Values: ParameterStringFilterValueList = null
  ): ParameterStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (Option != null) __obj.updateDynamic("Option")(Option.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterStringFilter]
  }
}

