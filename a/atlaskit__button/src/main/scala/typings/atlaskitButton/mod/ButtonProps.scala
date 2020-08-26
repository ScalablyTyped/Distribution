package typings.atlaskitButton.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends js.Object {
  /** The base styling to apply to the button. */
  val appearance: js.UndefOr[ButtonAppearances] = js.native
  /** Pass aria-controls to underlying html button. */
  val ariaControls: js.UndefOr[String] = js.native
  /** Pass aria-expanded to underlying html button. */
  val ariaExpanded: js.UndefOr[Boolean] = js.native
  /** Pass aria-haspopup to underlying html button. */
  val ariaHaspopup: js.UndefOr[Boolean] = js.native
  /** This button's child nodes. */
  val children: js.UndefOr[ReactNode] = js.native
  /** Add a classname to the button. */
  val className: js.UndefOr[String] = js.native
  /** A custom component to use instead of the default button. */
  val component: js.UndefOr[ComponentClass[_, ComponentState]] = js.native
  /** Name property of a linked form that the button submits when clicked. */
  val form: js.UndefOr[String] = js.native
  /** Provides a url for buttons being used as a link. */
  val href: js.UndefOr[String] = js.native
  /** Places an icon within the button, after the button's text. */
  val iconAfter: js.UndefOr[ReactElement] = js.native
  /** Places an icon within the button, before the button's text. */
  val iconBefore: js.UndefOr[ReactElement] = js.native
  /** Provide a unique id to the button. */
  val id: js.UndefOr[String] = js.native
  /** Pass a reference on to the styled component */
  val innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.native
  /** Set if the button is disabled. */
  val isDisabled: js.UndefOr[Boolean] = js.native
  /** Change the style to indicate the button is selected. */
  val isSelected: js.UndefOr[Boolean] = js.native
  /** Handler to be called on click. */
  val onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  /** Option to fit button width to its parent width */
  val shouldFitContainer: js.UndefOr[Boolean] = js.native
  /** Set the amount of padding in the button. */
  val spacing: js.UndefOr[ButtonSpacing] = js.native
  /** Assign specific tabIndex order to the underlying html button. */
  val tabIndex: js.UndefOr[Double] = js.native
  /** Pass target down to a link within the button component, if a href is provided. */
  val target: js.UndefOr[String] = js.native
  /** Set whether it is a button or a form submission. */
  val `type`: js.UndefOr[ButtonType] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
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
    def setAppearance(value: ButtonAppearances): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setAriaControls(value: String): Self = this.set("ariaControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaControls: Self = this.set("ariaControls", js.undefined)
    @scala.inline
    def setAriaExpanded(value: Boolean): Self = this.set("ariaExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaExpanded: Self = this.set("ariaExpanded", js.undefined)
    @scala.inline
    def setAriaHaspopup(value: Boolean): Self = this.set("ariaHaspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaHaspopup: Self = this.set("ariaHaspopup", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponent(value: ComponentClass[_, ComponentState]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIconAfter(value: ReactElement): Self = this.set("iconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconAfter: Self = this.set("iconAfter", js.undefined)
    @scala.inline
    def setIconBefore(value: ReactElement): Self = this.set("iconBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconBefore: Self = this.set("iconBefore", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInnerRef(value: /* instance */ js.Any => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setShouldFitContainer(value: Boolean): Self = this.set("shouldFitContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldFitContainer: Self = this.set("shouldFitContainer", js.undefined)
    @scala.inline
    def setSpacing(value: ButtonSpacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: ButtonType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

