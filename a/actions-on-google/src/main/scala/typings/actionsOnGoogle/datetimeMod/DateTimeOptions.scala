package typings.actionsOnGoogle.datetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeOptions extends js.Object {
  /**
    * Prompts for the user
    * @public
    */
  var prompts: js.UndefOr[DateTimeOptionsPrompts] = js.undefined
}

object DateTimeOptions {
  @scala.inline
  def apply(prompts: DateTimeOptionsPrompts = null): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (prompts != null) __obj.updateDynamic("prompts")(prompts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeOptions]
  }
}

