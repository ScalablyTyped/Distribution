package typings.angularFormly.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularFormly.AngularFormly.IExpressionFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorExistsAndShouldBeVisible extends js.Object {
  /**
    * This is set by angular-formly. This is a boolean indicating whether an error message should be shown. Because
    * you generally only want to show error messages when the user has interacted with a specific field, this value
    * is set to true based on this rule: field invalid && (field touched || validation.show) (with slight difference
    * for pre-angular 1.3 because it doesn't have touched support).
    */
  var errorExistsAndShouldBeVisible: js.UndefOr[Boolean] = js.native
  /**
    * A map of Formly Expressions mapped to message names. This is really useful when you're using ng-messages
    * like in this example.
    */
  var messages: js.UndefOr[StringDictionary[IExpressionFunction | String]] = js.native
  /**
    * A boolean you as the developer can set to specify to force options.validation.errorExistsAndShouldBeVisible
    * to be set to true when there are $errors. This is useful when you're trying to call the user's attention to
    * some fields for some reason.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object ErrorExistsAndShouldBeVisible {
  @scala.inline
  def apply(): ErrorExistsAndShouldBeVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorExistsAndShouldBeVisible]
  }
  @scala.inline
  implicit class ErrorExistsAndShouldBeVisibleOps[Self <: ErrorExistsAndShouldBeVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorExistsAndShouldBeVisible(value: Boolean): Self = this.set("errorExistsAndShouldBeVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorExistsAndShouldBeVisible: Self = this.set("errorExistsAndShouldBeVisible", js.undefined)
    @scala.inline
    def setMessages(value: StringDictionary[IExpressionFunction | String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

