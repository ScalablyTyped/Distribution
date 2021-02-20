package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.left
import typings.antDesignReactNative.antDesignReactNativeStrings.right
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerPropsTypeMod {
  
  @js.native
  trait DrawerProps extends StObject {
    
    var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[left | right | top | bottom] = js.native
    
    var sidebar: js.UndefOr[ReactNode] = js.native
  }
  object DrawerProps {
    
    @scala.inline
    def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    @scala.inline
    implicit class DrawerPropsMutableBuilder[Self <: DrawerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnOpenChange(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSidebar(value: ReactNode): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
    }
  }
  
  @js.native
  trait DrawerWebProps extends DrawerProps {
    
    var className: js.UndefOr[String] = js.native
    
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    var docked: js.UndefOr[Boolean] = js.native
    
    var dragHandleStyle: js.UndefOr[CSSProperties] = js.native
    
    var dragToggleDistance: js.UndefOr[Double] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var sidebarStyle: js.UndefOr[CSSProperties] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var touch: js.UndefOr[Boolean] = js.native
    
    var transitions: js.UndefOr[Boolean] = js.native
  }
  object DrawerWebProps {
    
    @scala.inline
    def apply(): DrawerWebProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerWebProps]
    }
    
    @scala.inline
    implicit class DrawerWebPropsMutableBuilder[Self <: DrawerWebProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
      
      @scala.inline
      def setDragHandleStyle(value: CSSProperties): Self = StObject.set(x, "dragHandleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleStyleUndefined: Self = StObject.set(x, "dragHandleStyle", js.undefined)
      
      @scala.inline
      def setDragToggleDistance(value: Double): Self = StObject.set(x, "dragToggleDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragToggleDistanceUndefined: Self = StObject.set(x, "dragToggleDistance", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSidebarStyle(value: CSSProperties): Self = StObject.set(x, "sidebarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarStyleUndefined: Self = StObject.set(x, "sidebarStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
}
