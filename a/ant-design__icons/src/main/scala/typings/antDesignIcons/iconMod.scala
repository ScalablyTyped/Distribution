package typings.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIcons.anon.PickIconComponentPropsari
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLProps
import typings.react.mod.SVGProps
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/dist/components/Icon", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickIconComponentPropsari] = js.native
  
  @js.native
  trait CustomIconComponentProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var fill: String = js.native
    
    var height: String | Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var width: String | Double = js.native
  }
  object CustomIconComponentProps {
    
    @scala.inline
    def apply(fill: String, height: String | Double, width: String | Double): CustomIconComponentProps = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIconComponentProps]
    }
    
    @scala.inline
    implicit class CustomIconComponentPropsMutableBuilder[Self <: CustomIconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IconBaseProps extends HTMLProps[HTMLSpanElement] {
    
    var rotate: js.UndefOr[Double] = js.native
    
    var spin: js.UndefOr[Boolean] = js.native
  }
  object IconBaseProps {
    
    @scala.inline
    def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    @scala.inline
    implicit class IconBasePropsMutableBuilder[Self <: IconBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    }
  }
  
  @js.native
  trait IconComponentProps extends IconBaseProps {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
  }
  object IconComponentProps {
    
    @scala.inline
    def apply(): IconComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconComponentProps]
    }
    
    @scala.inline
    implicit class IconComponentPropsMutableBuilder[Self <: IconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponent(value: ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PickIconComponentPropsari]
  
  /* This means you don't have to write `default`, but can instead just say `iconMod.foo` */
  override def _to: ForwardRefExoticComponent[PickIconComponentPropsari] = default
}
