package typings.atlaskitButton

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/button", JSImport.Default)
  @js.native
  class default ()
    extends Component[ButtonProps, ButtonState, js.Any]
  
  @JSImport("@atlaskit/button", "ButtonGroup")
  @js.native
  class ButtonGroup protected ()
    extends Component[ButtonGroupProps, js.Object, js.Any] {
    def this(props: ButtonGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ButtonGroupProps, context: js.Any) = this()
  }
  
  @JSImport("@atlaskit/button", "themeNamespace")
  @js.native
  val themeNamespace: String = js.native
  
  type Button = Component[ButtonProps, ButtonState, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitButton.atlaskitButtonStrings.default
    - typings.atlaskitButton.atlaskitButtonStrings.danger
    - typings.atlaskitButton.atlaskitButtonStrings.link
    - typings.atlaskitButton.atlaskitButtonStrings.primary
    - typings.atlaskitButton.atlaskitButtonStrings.subtle
    - typings.atlaskitButton.atlaskitButtonStrings.`subtle-link`
    - typings.atlaskitButton.atlaskitButtonStrings.warning
    - typings.atlaskitButton.atlaskitButtonStrings.help
  */
  trait ButtonAppearances extends StObject
  object ButtonAppearances {
    
    inline def default: typings.atlaskitButton.atlaskitButtonStrings.default = "default".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.default]
    
    inline def danger: typings.atlaskitButton.atlaskitButtonStrings.danger = "danger".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.danger]
    
    inline def help: typings.atlaskitButton.atlaskitButtonStrings.help = "help".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.help]
    
    inline def link: typings.atlaskitButton.atlaskitButtonStrings.link = "link".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.link]
    
    inline def primary: typings.atlaskitButton.atlaskitButtonStrings.primary = "primary".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.primary]
    
    inline def subtle: typings.atlaskitButton.atlaskitButtonStrings.subtle = "subtle".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.subtle]
    
    inline def `subtle-link`: typings.atlaskitButton.atlaskitButtonStrings.`subtle-link` = "subtle-link".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.`subtle-link`]
    
    inline def warning: typings.atlaskitButton.atlaskitButtonStrings.warning = "warning".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.warning]
  }
  
  trait ButtonGroupProps extends StObject {
    
    /** The appearance to apply to all buttons. */
    val appearance: js.UndefOr[ButtonAppearances] = js.undefined
    
    /** The buttons to render. */
    val children: ReactNode
  }
  object ButtonGroupProps {
    
    inline def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    extension [Self <: ButtonGroupProps](x: Self) {
      
      inline def setAppearance(value: ButtonAppearances): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ButtonProps extends StObject {
    
    /** The base styling to apply to the button. */
    val appearance: js.UndefOr[ButtonAppearances] = js.undefined
    
    /** Pass aria-controls to underlying html button. */
    val ariaControls: js.UndefOr[String] = js.undefined
    
    /** Pass aria-expanded to underlying html button. */
    val ariaExpanded: js.UndefOr[Boolean] = js.undefined
    
    /** Pass aria-haspopup to underlying html button. */
    val ariaHaspopup: js.UndefOr[Boolean] = js.undefined
    
    /** This button's child nodes. */
    val children: js.UndefOr[ReactNode] = js.undefined
    
    /** Add a classname to the button. */
    val className: js.UndefOr[String] = js.undefined
    
    /** A custom component to use instead of the default button. */
    val component: js.UndefOr[ComponentClass[js.Any, ComponentState]] = js.undefined
    
    /** Name property of a linked form that the button submits when clicked. */
    val form: js.UndefOr[String] = js.undefined
    
    /** Provides a url for buttons being used as a link. */
    val href: js.UndefOr[String] = js.undefined
    
    /** Places an icon within the button, after the button's text. */
    val iconAfter: js.UndefOr[ReactElement] = js.undefined
    
    /** Places an icon within the button, before the button's text. */
    val iconBefore: js.UndefOr[ReactElement] = js.undefined
    
    /** Provide a unique id to the button. */
    val id: js.UndefOr[String] = js.undefined
    
    /** Pass a reference on to the styled component */
    val innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
    
    /** Set if the button is disabled. */
    val isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** Change the style to indicate the button is selected. */
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Handler to be called on click. */
    val onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /** Option to fit button width to its parent width */
    val shouldFitContainer: js.UndefOr[Boolean] = js.undefined
    
    /** Set the amount of padding in the button. */
    val spacing: js.UndefOr[ButtonSpacing] = js.undefined
    
    /** Assign specific tabIndex order to the underlying html button. */
    val tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Pass target down to a link within the button component, if a href is provided. */
    val target: js.UndefOr[String] = js.undefined
    
    /** Set whether it is a button or a form submission. */
    val `type`: js.UndefOr[ButtonType] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setAppearance(value: ButtonAppearances): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
      
      inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHaspopup(value: Boolean): Self = StObject.set(x, "ariaHaspopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHaspopupUndefined: Self = StObject.set(x, "ariaHaspopup", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: ComponentClass[js.Any, ComponentState]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIconAfter(value: ReactElement): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setIconBefore(value: ReactElement): Self = StObject.set(x, "iconBefore", value.asInstanceOf[js.Any])
      
      inline def setIconBeforeUndefined: Self = StObject.set(x, "iconBefore", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInnerRef(value: /* instance */ js.Any => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setShouldFitContainer(value: Boolean): Self = StObject.set(x, "shouldFitContainer", value.asInstanceOf[js.Any])
      
      inline def setShouldFitContainerUndefined: Self = StObject.set(x, "shouldFitContainer", js.undefined)
      
      inline def setSpacing(value: ButtonSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitButton.atlaskitButtonStrings.compact
    - typings.atlaskitButton.atlaskitButtonStrings.default
    - typings.atlaskitButton.atlaskitButtonStrings.none
  */
  trait ButtonSpacing extends StObject
  object ButtonSpacing {
    
    inline def default: typings.atlaskitButton.atlaskitButtonStrings.default = "default".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.default]
    
    inline def compact: typings.atlaskitButton.atlaskitButtonStrings.compact = "compact".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.compact]
    
    inline def none: typings.atlaskitButton.atlaskitButtonStrings.none = "none".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.none]
  }
  
  trait ButtonState extends StObject {
    
    val isActive: Boolean
    
    val isFocus: Boolean
    
    val isHover: Boolean
  }
  object ButtonState {
    
    inline def apply(isActive: Boolean, isFocus: Boolean, isHover: Boolean): ButtonState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonState]
    }
    
    extension [Self <: ButtonState](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
      
      inline def setIsHover(value: Boolean): Self = StObject.set(x, "isHover", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitButton.atlaskitButtonStrings.button
    - typings.atlaskitButton.atlaskitButtonStrings.submit
  */
  trait ButtonType extends StObject
  object ButtonType {
    
    inline def button: typings.atlaskitButton.atlaskitButtonStrings.button = "button".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.button]
    
    inline def submit: typings.atlaskitButton.atlaskitButtonStrings.submit = "submit".asInstanceOf[typings.atlaskitButton.atlaskitButtonStrings.submit]
  }
}
