package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliDashApp.aliDashAppStrings.transitionend
  - typings.aliDashApp.aliDashAppStrings.animationstart
  - typings.aliDashApp.aliDashAppStrings.animationiteration
  - typings.aliDashApp.aliDashAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typings.aliDashApp.aliDashAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typings.aliDashApp.aliDashAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typings.aliDashApp.aliDashAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typings.aliDashApp.aliDashAppStrings.transitionend = this.cast("transitionend")
}

