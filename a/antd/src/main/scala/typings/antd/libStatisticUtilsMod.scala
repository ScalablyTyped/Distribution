package typings.antd

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatisticUtilsMod {
  
  @JSImport("antd/lib/statistic/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCountdown(value: countdownValueType, config: CountdownFormatConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCountdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTimeStr(duration: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeStr")(duration.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CountdownFormatConfig
    extends StObject
       with FormatConfig {
    
    var format: js.UndefOr[String] = js.undefined
  }
  object CountdownFormatConfig {
    
    inline def apply(): CountdownFormatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountdownFormatConfig]
    }
    
    extension [Self <: CountdownFormatConfig](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait FormatConfig extends StObject {
    
    var decimalSeparator: js.UndefOr[String] = js.undefined
    
    var formatter: js.UndefOr[Formatter] = js.undefined
    
    var groupSeparator: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object FormatConfig {
    
    inline def apply(): FormatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatConfig]
    }
    
    extension [Self <: FormatConfig](x: Self) {
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
      
      inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactNode): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      inline def setGroupSeparatorUndefined: Self = StObject.set(x, "groupSeparator", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdBooleans.`false`
    - typings.antd.antdStrings.number
    - typings.antd.antdStrings.countdown
    - js.Function2[
  / * value * / typings.antd.libStatisticUtilsMod.valueType, 
  / * config * / js.UndefOr[typings.antd.libStatisticUtilsMod.FormatConfig], 
  typings.react.mod.ReactNode]
  */
  type Formatter = _Formatter | (js.Function2[/* value */ valueType, /* config */ js.UndefOr[FormatConfig], ReactNode])
  
  trait _Formatter extends StObject
  
  type countdownValueType = valueType | String
  
  type valueType = Double | String
}
