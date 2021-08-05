package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rateMod extends Shortcut {
  
  @JSImport("antd/lib/rate", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RateProps & RefAttributes[js.Any]] = js.native
  
  trait RateProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var allowHalf: js.UndefOr[Boolean] = js.undefined
    
    var character: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tooltips: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object RateProps {
    
    inline def apply(): RateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateProps]
    }
    
    extension [Self <: RateProps](x: Self) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      inline def setCharacter(value: ReactNode): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnHoverChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction1(value))
      
      inline def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltips(value: js.Array[String]): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      inline def setTooltipsVarargs(value: String*): Self = StObject.set(x, "tooltips", js.Array(value :_*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RateProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rateMod.foo` */
  override def _to: ForwardRefExoticComponent[RateProps & RefAttributes[js.Any]] = default
}
