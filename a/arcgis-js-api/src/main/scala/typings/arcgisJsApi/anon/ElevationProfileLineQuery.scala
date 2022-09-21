package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.query
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.ElevationProfileLineQuerySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ElevationProfileLineQueryProperties & {  type :'query'} */
trait ElevationProfileLineQuery extends StObject {
  
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
    * Elevation source used to sample elevation when generating the profile, for example an [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html#source)
    */
  var source: js.UndefOr[ElevationProfileLineQuerySource] = js.undefined
  
  /**
    * Title of the line, to be displayed in the chart tooltip and in the chart legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: query
  
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
object ElevationProfileLineQuery {
  
  inline def apply(): ElevationProfileLineQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[ElevationProfileLineQuery]
  }
  
  extension [Self <: ElevationProfileLineQuery](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSource(value: ElevationProfileLineQuerySource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: query): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewVisualizationEnabled(value: Boolean): Self = StObject.set(x, "viewVisualizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setViewVisualizationEnabledUndefined: Self = StObject.set(x, "viewVisualizationEnabled", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
