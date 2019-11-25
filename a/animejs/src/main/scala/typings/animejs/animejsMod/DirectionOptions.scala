package typings.animejs.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.animejs.animejsStrings.reverse
  - typings.animejs.animejsStrings.alternate
  - typings.animejs.animejsStrings.normal
*/
trait DirectionOptions extends js.Object

object DirectionOptions {
  @scala.inline
  def alternate: typings.animejs.animejsStrings.alternate = this.cast("alternate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.animejs.animejsStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typings.animejs.animejsStrings.reverse = this.cast("reverse")
}

