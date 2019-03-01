package typings
package angularDashDialogDashServiceLib.angularNs.dialogserviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogOptions extends js.Object {
  /**
    * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
    *
    * @default false
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * controls the presence of a backdrop
    * Allowed values:
    *   - true (default)
    *   - false (no backdrop)
    *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
    *
    * @default true
    */
  var backdrop: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * additional CSS class(es) to be added to a modal backdrop template
    *
    * @default 'dialogs-backdrop-default'
    */
  var backdropClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * indicates whether the dialog should be closable by hitting the ESC key
    *
    * @default true
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
    *
    * @default 'lg'
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /**
    * additional CSS class(es) to be added to a modal window template
    *
    * @default 'dialogs-default'
    */
  var windowClass: js.UndefOr[java.lang.String] = js.undefined
}

object IDialogOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: scala.Boolean | java.lang.String = null,
    backdropClass: java.lang.String = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    windowClass: java.lang.String = null
  ): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropClass != null) __obj.updateDynamic("backdropClass")(backdropClass)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (size != null) __obj.updateDynamic("size")(size)
    if (windowClass != null) __obj.updateDynamic("windowClass")(windowClass)
    __obj.asInstanceOf[IDialogOptions]
  }
}

