package typings.atlaskitButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atlaskitButton.atlaskitButtonStrings.button
  - typings.atlaskitButton.atlaskitButtonStrings.submit
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  def button: typings.atlaskitButton.atlaskitButtonStrings.button = this.cast("button")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def submit: typings.atlaskitButton.atlaskitButtonStrings.submit = this.cast("submit")
}

