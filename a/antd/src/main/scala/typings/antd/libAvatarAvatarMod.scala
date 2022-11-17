package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libAvatarSizeContextMod.AvatarSize
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarAvatarMod extends Shortcut {
  
  @JSImport("antd/lib/avatar/avatar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AvatarProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait AvatarProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr["" | "anonymous" | "use-credentials"] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[Double] = js.undefined
    
    /** Icon to be used in avatar */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** Shape of avatar, options: `circle`, `square` */
    var shape: js.UndefOr["circle" | "square"] = js.undefined
    
    var size: js.UndefOr[AvatarSize] = js.undefined
    
    /** Src of image avatar */
    var src: js.UndefOr[ReactNode] = js.undefined
    
    /** Srcset of image avatar */
    var srcSet: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCrossOrigin(value: "" | "anonymous" | "use-credentials"): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnClick(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnError(value: () => Boolean): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShape(value: "circle" | "square"): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: ReactNode): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[AvatarProps & RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libAvatarAvatarMod.foo` */
  override def _to: ForwardRefExoticComponent[AvatarProps & RefAttributes[HTMLSpanElement]] = default
}
