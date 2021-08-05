package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NamedExoticComponent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backTopMod extends Shortcut {
  
  @JSImport("antd/lib/back-top", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[BackTopProps] = js.native
  
  trait BackTopProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.UndefOr[js.Function0[HTMLElement | Window | Document]] = js.undefined
    
    var visibilityHeight: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object BackTopProps {
    
    inline def apply(): BackTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackTopProps]
    }
    
    extension [Self <: BackTopProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: () => HTMLElement | Window | Document): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setVisibilityHeight(value: Double): Self = StObject.set(x, "visibilityHeight", value.asInstanceOf[js.Any])
      
      inline def setVisibilityHeightUndefined: Self = StObject.set(x, "visibilityHeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = NamedExoticComponent[BackTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `backTopMod.foo` */
  override def _to: NamedExoticComponent[BackTopProps] = default
}
