package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewPrefixCls extends js.Object {
  var listPrefixCls: String = js.native
  var listViewPrefixCls: String = js.native
  var prefixCls: String = js.native
}

object ListViewPrefixCls {
  @scala.inline
  def apply(listPrefixCls: String, listViewPrefixCls: String, prefixCls: String): ListViewPrefixCls = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], listViewPrefixCls = listViewPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPrefixCls]
  }
  @scala.inline
  implicit class ListViewPrefixClsOps[Self <: ListViewPrefixCls] (val x: Self) extends AnyVal {
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
    def setListPrefixCls(value: String): Self = this.set("listPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setListViewPrefixCls(value: String): Self = this.set("listViewPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

