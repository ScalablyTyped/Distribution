package typings.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIcons.anon.PickIconComponentPropsmax
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLProps
import typings.react.mod.SVGProps
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/lib/components/Icon", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickIconComponentPropsmax] = js.native
  
  trait CustomIconComponentProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var fill: String
    
    var height: String | Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: String | Double
  }
  object CustomIconComponentProps {
    
    inline def apply(fill: String, height: String | Double, width: String | Double): CustomIconComponentProps = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIconComponentProps]
    }
    
    extension [Self <: CustomIconComponentProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconBaseProps
    extends StObject
       with HTMLProps[HTMLSpanElement] {
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var spin: js.UndefOr[Boolean] = js.undefined
  }
  object IconBaseProps {
    
    inline def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    extension [Self <: IconBaseProps](x: Self) {
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    }
  }
  
  trait IconComponentProps
    extends StObject
       with IconBaseProps {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[
        (ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]) | ForwardRefExoticComponent[CustomIconComponentProps]
      ] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object IconComponentProps {
    
    inline def apply(): IconComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconComponentProps]
    }
    
    extension [Self <: IconComponentProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setComponent(
        value: (ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]) | ForwardRefExoticComponent[CustomIconComponentProps]
      ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PickIconComponentPropsmax]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsIconMod.foo` */
  override def _to: ForwardRefExoticComponent[PickIconComponentPropsmax] = default
}
