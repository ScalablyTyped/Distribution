package typings.antvG2.anon

import typings.antvG2.mod.Styles.background
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2.@antv/g2.ChartProps> */
trait PartialChartProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  
  var container: js.UndefOr[String | HTMLDivElement] = js.undefined
  
  var data: js.UndefOr[js.Object | js.Any] = js.undefined
  
  var forceFit: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[
    Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var plotBackground: js.UndefOr[background] = js.undefined
  
  var theme: js.UndefOr[js.Object | String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialChartProps {
  
  inline def apply(): PartialChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChartProps]
  }
  
  extension [Self <: PartialChartProps](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContainer(value: String | HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setData(value: js.Object | js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    inline def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPadding(
      value: Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    inline def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    inline def setTheme(value: js.Object | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
