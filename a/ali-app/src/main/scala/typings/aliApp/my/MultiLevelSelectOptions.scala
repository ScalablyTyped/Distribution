package typings.aliApp.my

import typings.aliApp.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLevelSelectOptions
  extends BaseOptions[js.Any, js.Any] {
                          // 标题
  var list: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.native
          // 选择数据列表
  var name: js.UndefOr[String] = js.native
                          // 条目名称
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.native
      // 子条目列表
  @JSName("success")
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ Result, Unit]] = js.native
  var title: js.UndefOr[String] = js.native
}

object MultiLevelSelectOptions {
  @scala.inline
  def apply(): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
  @scala.inline
  implicit class MultiLevelSelectOptionsOps[Self <: MultiLevelSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListVarargs(value: MultiLevelSelectItem*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[MultiLevelSelectItem]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubListVarargs(value: MultiLevelSelectItem*): Self = this.set("subList", js.Array(value :_*))
    @scala.inline
    def setSubList(value: js.Array[MultiLevelSelectItem]): Self = this.set("subList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubList: Self = this.set("subList", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ Result => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

