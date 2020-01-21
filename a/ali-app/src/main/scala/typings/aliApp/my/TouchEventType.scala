package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliApp.aliAppStrings.tap
  - typings.aliApp.aliAppStrings.touchstart
  - typings.aliApp.aliAppStrings.touchmove
  - typings.aliApp.aliAppStrings.touchcancel
  - typings.aliApp.aliAppStrings.touchend
  - typings.aliApp.aliAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typings.aliApp.aliAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typings.aliApp.aliAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typings.aliApp.aliAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typings.aliApp.aliAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typings.aliApp.aliAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.aliApp.aliAppStrings.touchstart = this.cast("touchstart")
}

