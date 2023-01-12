package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libStatisticStatisticMod.StatisticProps
import typings.antd.libStatisticUtilsMod.countdownValueType
import typings.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatisticCountdownMod extends Shortcut {
  
  @JSImport("antd/lib/statistic/Countdown", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[CountdownProps] = js.native
  
  trait CountdownProps
    extends StObject
       with StatisticProps {
    
    var format: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[countdownValueType], Unit]] = js.undefined
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("value")
    var value_CountdownProps: js.UndefOr[countdownValueType] = js.undefined
  }
  object CountdownProps {
    
    inline def apply(): CountdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountdownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountdownProps] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[countdownValueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setValue(value: countdownValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = NamedExoticComponent[CountdownProps]
  
  /* This means you don't have to write `default`, but can instead just say `libStatisticCountdownMod.foo` */
  override def _to: NamedExoticComponent[CountdownProps] = default
}
