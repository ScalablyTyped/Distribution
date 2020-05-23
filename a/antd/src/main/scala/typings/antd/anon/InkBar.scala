package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkBar extends js.Object {
  var inkBar: Boolean
  var tabPane: Boolean
}

object InkBar {
  @scala.inline
  def apply(inkBar: Boolean, tabPane: Boolean): InkBar = {
    val __obj = js.Dynamic.literal(inkBar = inkBar.asInstanceOf[js.Any], tabPane = tabPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkBar]
  }
}

