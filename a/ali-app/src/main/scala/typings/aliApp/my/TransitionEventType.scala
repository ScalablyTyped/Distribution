package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliApp.aliAppStrings.transitionend
  - typings.aliApp.aliAppStrings.animationstart
  - typings.aliApp.aliAppStrings.animationiteration
  - typings.aliApp.aliAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typings.aliApp.aliAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typings.aliApp.aliAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typings.aliApp.aliAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typings.aliApp.aliAppStrings.transitionend = this.cast("transitionend")
}

