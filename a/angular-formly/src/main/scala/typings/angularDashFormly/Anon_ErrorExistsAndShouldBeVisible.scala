package typings.angularDashFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angularDashFormly.AngularFormly.IExpressionFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorExistsAndShouldBeVisible extends js.Object {
  /**
  			 * This is set by angular-formly. This is a boolean indicating whether an error message should be shown. Because
  			 * you generally only want to show error messages when the user has interacted with a specific field, this value
  			 * is set to true based on this rule: field invalid && (field touched || validation.show) (with slight difference
  			 * for pre-angular 1.3 because it doesn't have touched support).
  			 */
  var errorExistsAndShouldBeVisible: js.UndefOr[Boolean] = js.undefined
  /**
  			 * A map of Formly Expressions mapped to message names. This is really useful when you're using ng-messages
  			 * like in this example.
  			 */
  var messages: js.UndefOr[StringDictionary[IExpressionFunction | String]] = js.undefined
  /**
  			 * A boolean you as the developer can set to specify to force options.validation.errorExistsAndShouldBeVisible
  			 * to be set to true when there are $errors. This is useful when you're trying to call the user's attention to
  			 * some fields for some reason.
  			 */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_ErrorExistsAndShouldBeVisible {
  @scala.inline
  def apply(
    errorExistsAndShouldBeVisible: js.UndefOr[Boolean] = js.undefined,
    messages: StringDictionary[IExpressionFunction | String] = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_ErrorExistsAndShouldBeVisible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorExistsAndShouldBeVisible)) __obj.updateDynamic("errorExistsAndShouldBeVisible")(errorExistsAndShouldBeVisible)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_ErrorExistsAndShouldBeVisible]
  }
}

