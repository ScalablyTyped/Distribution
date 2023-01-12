package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.bottom
import typings.antdMobileRn.antdMobileRnStrings.left
import typings.antdMobileRn.antdMobileRnStrings.right
import typings.antdMobileRn.antdMobileRnStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDrawerPropsTypeMod {
  
  trait DrawerProps extends StObject {
    
    var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right | top | bottom] = js.undefined
    
    var sidebar: js.UndefOr[ReactNode] = js.undefined
  }
  object DrawerProps {
    
    inline def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerProps] (val x: Self) extends AnyVal {
      
      inline def setOnOpenChange(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSidebar(value: ReactNode): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
      
      inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
    }
  }
  
  trait DrawerWebProps
    extends StObject
       with DrawerProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var docked: js.UndefOr[Boolean] = js.undefined
    
    var dragHandleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dragToggleDistance: js.UndefOr[Double] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var sidebarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var transitions: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerWebProps {
    
    inline def apply(): DrawerWebProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerWebProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerWebProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      inline def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
      
      inline def setDragHandleStyle(value: CSSProperties): Self = StObject.set(x, "dragHandleStyle", value.asInstanceOf[js.Any])
      
      inline def setDragHandleStyleUndefined: Self = StObject.set(x, "dragHandleStyle", js.undefined)
      
      inline def setDragToggleDistance(value: Double): Self = StObject.set(x, "dragToggleDistance", value.asInstanceOf[js.Any])
      
      inline def setDragToggleDistanceUndefined: Self = StObject.set(x, "dragToggleDistance", js.undefined)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSidebarStyle(value: CSSProperties): Self = StObject.set(x, "sidebarStyle", value.asInstanceOf[js.Any])
      
      inline def setSidebarStyleUndefined: Self = StObject.set(x, "sidebarStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
}
