package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCountDownMod {
  
  @JSImport("ant-design-pro/lib/CountDown", JSImport.Default)
  @js.native
  open class default () extends Component[ICountDownProps, Any, Any]
  
  type CountDown = Component[ICountDownProps, Any, Any]
  
  trait ICountDownProps extends StObject {
    
    var format: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.Date | Double
  }
  object ICountDownProps {
    
    inline def apply(target: js.Date | Double): ICountDownProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICountDownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICountDownProps] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: /* time */ Double => Unit): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: js.Date | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
