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
  val children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Add a classname to the button. */
  val className: js.UndefOr[java.lang.String] = js.undefined
  /** A custom component to use instead of the default button. */
  val component: js.UndefOr[reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]] = js.undefined
  /** Name property of a linked form that the button submits when clicked. */
  val form: js.UndefOr[java.lang.String] = js.undefined
  /** Provides a url for buttons being used as a link. */
  val href: js.UndefOr[java.lang.String] = js.undefined
  /** Places an icon within the button, after the button's text. */
  val iconAfter: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  /** Places an icon within the button, before the button's text. */
  val iconBefore: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  /** Provide a unique id to the button. */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /** Pass a reference on to the styled component */
  val innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, scala.Unit]] = js.undefined
  /** Set if the button is disabled. */
  val isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Change the style to indicate the button is selected. */
  val isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /** Handler to be called on click. */
  val onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement]] = js.undefined
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

object ButtonProps {
  @scala.inline
  def apply(
    appearance: ButtonAppearances = null,
    ariaControls: java.lang.String = null,
    ariaExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    ariaHaspopup: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    component: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = null,
    form: java.lang.String = null,
    href: java.lang.String = null,
    iconAfter: reactLib.reactMod.ReactElement = null,
    iconBefore: reactLib.reactMod.ReactElement = null,
    id: java.lang.String = null,
    innerRef: /* instance */ js.Any => scala.Unit = null,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement] = null,
    shouldFitContainer: js.UndefOr[scala.Boolean] = js.undefined,
    spacing: ButtonSpacing = null,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    `type`: ButtonType = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance)
    if (ariaControls != null) __obj.updateDynamic("ariaControls")(ariaControls)
    if (!js.isUndefined(ariaExpanded)) __obj.updateDynamic("ariaExpanded")(ariaExpanded)
    if (!js.isUndefined(ariaHaspopup)) __obj.updateDynamic("ariaHaspopup")(ariaHaspopup)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (form != null) __obj.updateDynamic("form")(form)
    if (href != null) __obj.updateDynamic("href")(href)
    if (iconAfter != null) __obj.updateDynamic("iconAfter")(iconAfter)
    if (iconBefore != null) __obj.updateDynamic("iconBefore")(iconBefore)
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ButtonProps]
  }
}

