package typings
package atAtlaskitButtonLib.atAtlaskitButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  /** The base styling to apply to the button. */
  val appearance: js.UndefOr[ButtonAppearances] = js.undefined
  /** Pass aria-controls to underlying html button. */
  val ariaControls: js.UndefOr[java.lang.String] = js.undefined
  /** Pass aria-expanded to underlying html button. */
  val ariaExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass aria-haspopup to underlying html button. */
  val ariaHaspopup: js.UndefOr[scala.Boolean] = js.undefined
  /** This button's child nodes. */
  val children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Add a classname to the button. */
  val className: js.UndefOr[java.lang.String] = js.undefined
  /** A custom component to use instead of the default button. */
  val component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /** Name property of a linked form that the button submits when clicked. */
  val form: js.UndefOr[java.lang.String] = js.undefined
  /** Provides a url for buttons being used as a link. */
  val href: js.UndefOr[java.lang.String] = js.undefined
  /** Places an icon within the button, after the button's text. */
  val iconAfter: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /** Places an icon within the button, before the button's text. */
  val iconBefore: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /** Provide a unique id to the button. */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /** Pass a reference on to the styled component */
  val innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, scala.Unit]] = js.undefined
  /** Set if the button is disabled. */
  val isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Change the style to indicate the button is selected. */
  val isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /** Handler to be called on click. */
  val onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLButtonElement]] = js.undefined
  /** Option to fit button width to its parent width */
  val shouldFitContainer: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the amount of padding in the button. */
  val spacing: js.UndefOr[ButtonSpacing] = js.undefined
  /** Assign specific tabIndex order to the underlying html button. */
  val tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** Pass target down to a link within the button component, if a href is provided. */
  val target: js.UndefOr[java.lang.String] = js.undefined
  /** Set whether it is a button or a form submission. */
  val `type`: js.UndefOr[ButtonType] = js.undefined
}

