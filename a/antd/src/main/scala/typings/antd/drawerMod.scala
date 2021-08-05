package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdBooleans.`false`
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod extends Shortcut {
  
  @JSImport("antd/lib/drawer", JSImport.Default)
  @js.native
  val default: FC[DrawerProps] = js.native
  
  trait DrawerProps extends StObject {
    
    var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var destroyOnClose: js.UndefOr[Boolean] = js.undefined
    
    /** wrapper dom node style of header and body */
    var drawerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var footerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false`] = js.undefined
    
    var handler: js.UndefOr[ReactNode] = js.undefined
    
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ EventType, Unit]] = js.undefined
    
    var placement: js.UndefOr[placementType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var push: js.UndefOr[Boolean | PushState] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DrawerProps {
    
    inline def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    extension [Self <: DrawerProps](x: Self) {
      
      inline def setAfterVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction1(value))
      
      inline def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      inline def setDrawerStyle(value: CSSProperties): Self = StObject.set(x, "drawerStyle", value.asInstanceOf[js.Any])
      
      inline def setDrawerStyleUndefined: Self = StObject.set(x, "drawerStyle", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setHandler(value: ReactNode): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnClose(value: /* e */ EventType => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPlacement(value: placementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPush(value: Boolean | PushState): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type EventType = KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement | HTMLButtonElement, NativeMouseEvent])
  
  trait IDrawerState extends StObject {
    
    var push: js.UndefOr[Boolean] = js.undefined
  }
  object IDrawerState {
    
    inline def apply(): IDrawerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDrawerState]
    }
    
    extension [Self <: IDrawerState](x: Self) {
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  trait PushState extends StObject {
    
    var distance: String | Double
  }
  object PushState {
    
    inline def apply(distance: String | Double): PushState = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushState]
    }
    
    extension [Self <: PushState](x: Self) {
      
      inline def setDistance(value: String | Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[DrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `drawerMod.foo` */
  override def _to: FC[DrawerProps] = default
  
  type getContainerFunc = js.Function0[HTMLElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.top
    - typings.antd.antdStrings.right
    - typings.antd.antdStrings.bottom
    - typings.antd.antdStrings.left
  */
  trait placementType extends StObject
}
