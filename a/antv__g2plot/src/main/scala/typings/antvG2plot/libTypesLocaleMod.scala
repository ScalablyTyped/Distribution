package typings.antvG2plot

import typings.antvG2plot.anon.Decrease
import typings.antvG2plot.anon.LabelString
import typings.antvG2plot.anon.Total
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesLocaleMod {
  
  trait Locale extends StObject {
    
    /** 转化率组件 */
    var conversionTag: LabelString
    
    var general: Decrease
    
    var legend: js.UndefOr[Record[String, String]] = js.undefined
    
    var locale: String
    
    var scrollbar: js.UndefOr[Record[String, String]] = js.undefined
    
    var slider: js.UndefOr[Record[String, String]] = js.undefined
    
    /** 中心文本 */
    var statistic: Total
    
    var tooltip: js.UndefOr[Record[String, String]] = js.undefined
    
    var waterfall: Total
  }
  object Locale {
    
    inline def apply(conversionTag: LabelString, general: Decrease, locale: String, statistic: Total, waterfall: Total): Locale = {
      val __obj = js.Dynamic.literal(conversionTag = conversionTag.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any], waterfall = waterfall.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setConversionTag(value: LabelString): Self = StObject.set(x, "conversionTag", value.asInstanceOf[js.Any])
      
      inline def setGeneral(value: Decrease): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: Record[String, String]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setScrollbar(value: Record[String, String]): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSlider(value: Record[String, String]): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setStatistic(value: Total): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Record[String, String]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setWaterfall(value: Total): Self = StObject.set(x, "waterfall", value.asInstanceOf[js.Any])
    }
  }
}
