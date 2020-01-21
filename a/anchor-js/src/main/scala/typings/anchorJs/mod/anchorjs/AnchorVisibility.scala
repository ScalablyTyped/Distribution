package typings.anchorJs.mod.anchorjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.anchorJs.anchorJsStrings.always
  - typings.anchorJs.anchorJsStrings.hover
  - typings.anchorJs.anchorJsStrings.touch
*/
trait AnchorVisibility extends js.Object

object AnchorVisibility {
  @scala.inline
  def always: typings.anchorJs.anchorJsStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hover: typings.anchorJs.anchorJsStrings.hover = this.cast("hover")
  @scala.inline
  def touch: typings.anchorJs.anchorJsStrings.touch = this.cast("touch")
}

