package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.input
import typings.arcgisJsApi.esri.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ElevationProfileLineInputProperties & {  type :'input'} */
trait ElevationProfileLineInput extends StObject {
  
  /**
    * Color of the line on the chart and the hovered points in the view.
    *
    * @default #000000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Unique identifier for the profile line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the line, to be displayed in the chart tooltip and in the chart legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: input
  
  /**
    * Whether a line visualization representing [elevationSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#samples) should be added to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#viewVisualizationEnabled)
    */
  var viewVisualizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the line should be computed and shown in the chart.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ElevationProfileLineInput {
  
  inline def apply(): ElevationProfileLineInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("input")
    __obj.asInstanceOf[ElevationProfileLineInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileLineInput] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: input): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewVisualizationEnabled(value: Boolean): Self = StObject.set(x, "viewVisualizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setViewVisualizationEnabledUndefined: Self = StObject.set(x, "viewVisualizationEnabled", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
