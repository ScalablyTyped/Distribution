package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourceListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: Boolean
  def listStyle(): Unit
}

object Anon_DataSourceListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: () => Unit, showSearch: Boolean): Anon_DataSourceListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource, listStyle = js.Any.fromFunction0(listStyle), showSearch = showSearch)
  
    __obj.asInstanceOf[Anon_DataSourceListStyle]
  }
}

