package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: Boolean
  def listStyle(): Unit
}

object AnonListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: () => Unit, showSearch: Boolean): AnonListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = js.Any.fromFunction0(listStyle), showSearch = showSearch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonListStyle]
  }
}

