package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.FunctionalComponent
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeDom.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/components/Icon", JSImport.Default)
  @js.native
  val default: IconType = js.native
  
  trait CustomIconComponentProps extends StObject {
    
    var fill: String
    
    var height: String | Double
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: String | Double
  }
  object CustomIconComponentProps {
    
    inline def apply(fill: String, height: String | Double, width: String | Double): CustomIconComponentProps = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIconComponentProps]
    }
    
    extension [Self <: CustomIconComponentProps](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconBaseProps
    extends StObject
       with HTMLAttributes {
    
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
    
    var component: js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]] = js.undefined
    
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
      
      inline def setComponent(value: Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  @js.native
  trait IconType
    extends StObject
       with FunctionalComponent[IconComponentProps, js.Object] {
    
    @JSName("displayName")
    var displayName_IconType: String = js.native
  }
  
  type _To = IconType
  
  /* This means you don't have to write `default`, but can instead just say `iconMod.foo` */
  override def _to: IconType = default
}
