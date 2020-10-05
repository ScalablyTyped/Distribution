package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  var dataSource: js.Array[scala.Nothing] = js.native
  var showSearch: Boolean = js.native
  var titleText: String = js.native
}

object DataSource {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], showSearch: Boolean, titleText: String): DataSource = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
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
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
  }
  
}

