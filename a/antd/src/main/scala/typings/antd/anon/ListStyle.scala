package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: Boolean
  def listStyle(): Unit
}

object ListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: () => Unit, showSearch: Boolean): ListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = js.Any.fromFunction0(listStyle), showSearch = showSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStyle]
  }
}

