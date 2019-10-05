package typings.aliDashApp.my

import typings.aliDashApp.Anon_Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLevelSelectOptions
  extends BaseOptions[js.Any, js.Any] {
  						// 标题
  var list: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  		// 选择数据列表
  var name: js.UndefOr[String] = js.undefined
  						// 条目名称
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  	// 子条目列表
  @JSName("success")
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ Anon_Result, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MultiLevelSelectOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    list: js.Array[MultiLevelSelectItem] = null,
    name: String = null,
    subList: js.Array[MultiLevelSelectItem] = null,
    success: /* res */ Anon_Result => Unit = null,
    title: String = null
  ): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (list != null) __obj.updateDynamic("list")(list)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subList != null) __obj.updateDynamic("subList")(subList)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
}

