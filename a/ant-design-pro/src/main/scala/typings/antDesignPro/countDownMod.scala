package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countDownMod {
  
  @JSImport("ant-design-pro/lib/CountDown", JSImport.Default)
  @js.native
  class default ()
    extends Component[ICountDownProps, js.Any, js.Any]
  
  type CountDown = Component[ICountDownProps, js.Any, js.Any]
  
  @js.native
  trait ICountDownProps extends StObject {
    
    var format: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.native
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: Date | Double = js.native
  }
  object ICountDownProps {
    
    @scala.inline
    def apply(target: Date | Double): ICountDownProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICountDownProps]
    }
    
    @scala.inline
    implicit class ICountDownPropsMutableBuilder[Self <: ICountDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: /* time */ Double => Unit): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: Date | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
