package typings.antd.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.hover
  - typings.antd.antdStrings.focus
  - typings.antd.antdStrings.click
  - typings.antd.antdStrings.contextMenu
*/
trait TooltipTrigger extends js.Object

object TooltipTrigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.antd.antdStrings.click = this.cast("click")
  @scala.inline
  def contextMenu: typings.antd.antdStrings.contextMenu = this.cast("contextMenu")
  @scala.inline
  def focus: typings.antd.antdStrings.focus = this.cast("focus")
  @scala.inline
  def hover: typings.antd.antdStrings.hover = this.cast("hover")
}

