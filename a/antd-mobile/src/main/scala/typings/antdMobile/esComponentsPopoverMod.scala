package typings.antdMobile

import typings.antdMobile.anon.OmitPopoverPropscontentac
import typings.antdMobile.anon.PartialdefaultVisiblebool
import typings.antdMobile.anon.WeakValidationMapdefaultV
import typings.antdMobile.anon.defaultVisiblebooleanunde
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPopoverMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  defaultVisible :boolean | undefined,   visible :boolean | undefined,   onVisibleChange :(visible : boolean): void | undefined,   getContainer :antd-mobile.antd-mobile/es/utils/render-to-container.GetContainer | undefined,   destroyOnHide :boolean | undefined,   children :react.react.ReactElement,   mode :'dark' | 'light' | undefined,   trigger :'click' | undefined,   placement :antd-mobile.antd-mobile/es/components/popover.DeprecatedPlacement | antd-mobile.antd-mobile/es/components/popover.Placement | undefined,   stopPropagation :std.Array<'click'> | undefined,   content :react.react.ReactNode,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<'--z-index', string>> | undefined,   tabIndex :number | undefined} & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/popover/popover.PopoverRef>> & {  Menu :react.react.ForwardRefExoticComponent<std.Omit<antd-mobile.antd-mobile/es/components/popover/popover.PopoverProps, 'content'> & {  actions :std.Array<antd-mobile.antd-mobile/es/components/popover/popover-menu.Action>,   onAction :(item : antd-mobile.antd-mobile/es/components/popover/popover-menu.Action): void | undefined} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/popover/popover.PopoverRef>>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: defaultVisiblebooleanunde): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/popover", "default.Menu")
    @js.native
    def Menu: ForwardRefExoticComponent[OmitPopoverPropscontentac] = js.native
    inline def Menu_=(x: ForwardRefExoticComponent[OmitPopoverPropscontentac]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialdefaultVisiblebool] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialdefaultVisiblebool]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapdefaultV] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapdefaultV]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.topLeft
    - typings.antdMobile.antdMobileStrings.topRight
    - typings.antdMobile.antdMobileStrings.bottomLeft
    - typings.antdMobile.antdMobileStrings.bottomRight
    - typings.antdMobile.antdMobileStrings.leftTop
    - typings.antdMobile.antdMobileStrings.leftBottom
    - typings.antdMobile.antdMobileStrings.rightTop
    - typings.antdMobile.antdMobileStrings.rightBottom
  */
  trait DeprecatedPlacement extends StObject
  object DeprecatedPlacement {
    
    inline def bottomLeft: typings.antdMobile.antdMobileStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.antdMobile.antdMobileStrings.bottomLeft]
    
    inline def bottomRight: typings.antdMobile.antdMobileStrings.bottomRight = "bottomRight".asInstanceOf[typings.antdMobile.antdMobileStrings.bottomRight]
    
    inline def leftBottom: typings.antdMobile.antdMobileStrings.leftBottom = "leftBottom".asInstanceOf[typings.antdMobile.antdMobileStrings.leftBottom]
    
    inline def leftTop: typings.antdMobile.antdMobileStrings.leftTop = "leftTop".asInstanceOf[typings.antdMobile.antdMobileStrings.leftTop]
    
    inline def rightBottom: typings.antdMobile.antdMobileStrings.rightBottom = "rightBottom".asInstanceOf[typings.antdMobile.antdMobileStrings.rightBottom]
    
    inline def rightTop: typings.antdMobile.antdMobileStrings.rightTop = "rightTop".asInstanceOf[typings.antdMobile.antdMobileStrings.rightTop]
    
    inline def topLeft: typings.antdMobile.antdMobileStrings.topLeft = "topLeft".asInstanceOf[typings.antdMobile.antdMobileStrings.topLeft]
    
    inline def topRight: typings.antdMobile.antdMobileStrings.topRight = "topRight".asInstanceOf[typings.antdMobile.antdMobileStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.top
    - typings.antdMobile.antdMobileStrings.`top-start`
    - typings.antdMobile.antdMobileStrings.`top-end`
    - typings.antdMobile.antdMobileStrings.right
    - typings.antdMobile.antdMobileStrings.`right-start`
    - typings.antdMobile.antdMobileStrings.`right-end`
    - typings.antdMobile.antdMobileStrings.bottom
    - typings.antdMobile.antdMobileStrings.`bottom-start`
    - typings.antdMobile.antdMobileStrings.`bottom-end`
    - typings.antdMobile.antdMobileStrings.left
    - typings.antdMobile.antdMobileStrings.`left-start`
    - typings.antdMobile.antdMobileStrings.`left-end`
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typings.antdMobile.antdMobileStrings.bottom = "bottom".asInstanceOf[typings.antdMobile.antdMobileStrings.bottom]
    
    inline def `bottom-end`: typings.antdMobile.antdMobileStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.antdMobile.antdMobileStrings.`bottom-end`]
    
    inline def `bottom-start`: typings.antdMobile.antdMobileStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.antdMobile.antdMobileStrings.`bottom-start`]
    
    inline def left: typings.antdMobile.antdMobileStrings.left = "left".asInstanceOf[typings.antdMobile.antdMobileStrings.left]
    
    inline def `left-end`: typings.antdMobile.antdMobileStrings.`left-end` = "left-end".asInstanceOf[typings.antdMobile.antdMobileStrings.`left-end`]
    
    inline def `left-start`: typings.antdMobile.antdMobileStrings.`left-start` = "left-start".asInstanceOf[typings.antdMobile.antdMobileStrings.`left-start`]
    
    inline def right: typings.antdMobile.antdMobileStrings.right = "right".asInstanceOf[typings.antdMobile.antdMobileStrings.right]
    
    inline def `right-end`: typings.antdMobile.antdMobileStrings.`right-end` = "right-end".asInstanceOf[typings.antdMobile.antdMobileStrings.`right-end`]
    
    inline def `right-start`: typings.antdMobile.antdMobileStrings.`right-start` = "right-start".asInstanceOf[typings.antdMobile.antdMobileStrings.`right-start`]
    
    inline def top: typings.antdMobile.antdMobileStrings.top = "top".asInstanceOf[typings.antdMobile.antdMobileStrings.top]
    
    inline def `top-end`: typings.antdMobile.antdMobileStrings.`top-end` = "top-end".asInstanceOf[typings.antdMobile.antdMobileStrings.`top-end`]
    
    inline def `top-start`: typings.antdMobile.antdMobileStrings.`top-start` = "top-start".asInstanceOf[typings.antdMobile.antdMobileStrings.`top-start`]
  }
}
