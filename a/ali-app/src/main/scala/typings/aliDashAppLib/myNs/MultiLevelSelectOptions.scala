package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLevelSelectOptions
  extends BaseOptions[js.Any, js.Any] {
  						// 标题
  var list: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  		// 选择数据列表
  var name: js.UndefOr[java.lang.String] = js.undefined
  						// 条目名称
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  	// 子条目列表
  @JSName("success")
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Result, scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MultiLevelSelectOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    list: js.Array[MultiLevelSelectItem] = null,
    name: java.lang.String = null,
    subList: js.Array[MultiLevelSelectItem] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_Result, scala.Unit] = null,
    title: java.lang.String = null
  ): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (list != null) __obj.updateDynamic("list")(list)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subList != null) __obj.updateDynamic("subList")(subList)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
}

