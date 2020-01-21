package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularForms.angularFormsStrings.change
  - typings.angularForms.angularFormsStrings.blur
  - typings.angularForms.angularFormsStrings.submit
*/
trait FormHooks extends js.Object

object FormHooks {
  @scala.inline
  def blur: typings.angularForms.angularFormsStrings.blur = this.cast("blur")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.angularForms.angularFormsStrings.change = this.cast("change")
  @scala.inline
  def submit: typings.angularForms.angularFormsStrings.submit = this.cast("submit")
}

