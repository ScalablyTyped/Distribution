package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpinMod extends Shortcut {
  
  @JSImport("antd/lib/spin", JSImport.Default)
  @js.native
  val default: SpinFCType = js.native
  
  trait SpinClassProps
    extends StObject
       with SpinProps {
    
    var spinPrefixCls: String
  }
  object SpinClassProps {
    
    inline def apply(spinPrefixCls: String): SpinClassProps = {
      val __obj = js.Dynamic.literal(spinPrefixCls = spinPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpinClassProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpinClassProps] (val x: Self) extends AnyVal {
      
      inline def setSpinPrefixCls(value: String): Self = StObject.set(x, "spinPrefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpinFCType
    extends StObject
       with FunctionComponent[SpinProps] {
    
    def setDefaultIndicator(indicator: ReactNode): Unit = js.native
  }
  
  type SpinIndicator = ReactElement
  
  trait SpinProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var indicator: js.UndefOr[SpinIndicator] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SpinSize] = js.undefined
    
    var spinning: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tip: js.UndefOr[ReactNode] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
  }
  object SpinProps {
    
    inline def apply(): SpinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpinProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setIndicator(value: SpinIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SpinSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      inline def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTip(value: ReactNode): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.large
  */
  trait SpinSize extends StObject
  
  type _To = SpinFCType
  
  /* This means you don't have to write `default`, but can instead just say `libSpinMod.foo` */
  override def _to: SpinFCType = default
}
