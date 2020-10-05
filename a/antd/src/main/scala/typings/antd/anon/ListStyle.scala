package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing] = js.native
  var showSearch: Boolean = js.native
  def listStyle(): Unit = js.native
}

object ListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: () => Unit, showSearch: Boolean): ListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = js.Any.fromFunction0(listStyle), showSearch = showSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStyle]
  }
  @scala.inline
  implicit class ListStyleOps[Self <: ListStyle] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: scala.Nothing*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[scala.Nothing]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setListStyle(value: () => Unit): Self = this.set("listStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
  }
  
}

