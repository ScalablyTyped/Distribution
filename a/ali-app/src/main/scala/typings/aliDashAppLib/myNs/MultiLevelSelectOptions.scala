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
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_ResultSuccess, scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

