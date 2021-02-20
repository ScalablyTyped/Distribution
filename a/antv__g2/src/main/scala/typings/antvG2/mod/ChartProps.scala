package typings.antvG2.mod

import typings.antvG2.anon.Bottom
import typings.antvG2.mod.Styles.background
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 图表接收的参数
  */
@js.native
trait ChartProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.native
  
  var container: String | HTMLDivElement = js.native
  
  var data: js.UndefOr[js.Object | js.Any] = js.native
  
  var forceFit: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
  
  var padding: js.UndefOr[
    Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var plotBackground: js.UndefOr[background] = js.native
  
  /**
    * 主题
    */
  var theme: js.UndefOr[js.Object | String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartProps {
  
  @scala.inline
  def apply(container: String | HTMLDivElement, height: Double): ChartProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  
  @scala.inline
  implicit class ChartPropsMutableBuilder[Self <: ChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object | js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(
      value: Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    @scala.inline
    def setTheme(value: js.Object | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
