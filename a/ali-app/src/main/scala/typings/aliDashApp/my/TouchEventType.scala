package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliDashApp.aliDashAppStrings.tap
  - typings.aliDashApp.aliDashAppStrings.touchstart
  - typings.aliDashApp.aliDashAppStrings.touchmove
  - typings.aliDashApp.aliDashAppStrings.touchcancel
  - typings.aliDashApp.aliDashAppStrings.touchend
  - typings.aliDashApp.aliDashAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typings.aliDashApp.aliDashAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typings.aliDashApp.aliDashAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typings.aliDashApp.aliDashAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typings.aliDashApp.aliDashAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typings.aliDashApp.aliDashAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.aliDashApp.aliDashAppStrings.touchstart = this.cast("touchstart")
}

