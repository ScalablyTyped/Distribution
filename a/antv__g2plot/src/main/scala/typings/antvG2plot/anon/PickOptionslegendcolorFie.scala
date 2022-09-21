package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'legend'> & {  colorField :string | undefined,   seriesField :string | undefined} */
trait PickOptionslegendcolorFie extends StObject {
  
  var colorField: js.UndefOr[String] = js.undefined
  
  var legend: js.UndefOr[typings.antvG2plot.typesLegendMod.Legend] = js.undefined
  
  var seriesField: js.UndefOr[String] = js.undefined
}
object PickOptionslegendcolorFie {
  
  inline def apply(): PickOptionslegendcolorFie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionslegendcolorFie]
  }
  
  extension [Self <: PickOptionslegendcolorFie](x: Self) {
    
    inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    inline def setLegend(value: typings.antvG2plot.typesLegendMod.Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
    
    inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
  }
}
