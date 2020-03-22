package typings.antd.autoCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.InternalSelectProps<string>, 'inputIcon' | 'loading' | 'mode' | 'optionLabelProp' | 'labelInValue'> ]: antd.antd/lib/select.InternalSelectProps<string>[P]} */ trait AutoCompleteProps extends js.Object {
  var dataSource: js.UndefOr[js.Array[DataSourceItemType]] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply(dataSource: js.Array[DataSourceItemType] = null): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps]
  }
}

