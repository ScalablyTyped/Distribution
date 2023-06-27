package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ground
import typings.arcgisJsApi.arcgisJsApiStrings.input
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationProfileLine
  extends StObject
     with Accessor {
  
  /**
  		 * Color of the line on the chart and the hovered points in the view.
  		 *
  		 * @default #000000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * Point being hovered in the chart, in the view's spatial reference.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#hoveredPoint)
  		 */
  val hoveredPoint: Point = js.native
  
  /**
  		 * Unique identifier for the profile line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#id)
  		 */
  var id: String = js.native
  
  /**
  		 * How far along the generation of this profile is.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#progress)
  		 */
  val progress: Double = js.native
  
  /**
  		 * List of samples that make up the elevation profile.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#samples)
  		 */
  val samples: js.Array[ElevationProfileSample] = js.native
  
  /**
  		 * Statistics about the generated elevation profile, if available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#statistics)
  		 */
  val statistics: ElevationProfileStatistics = js.native
  
  /**
  		 * Title of the line, to be displayed in the chart tooltip and in the chart legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * The line type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#type)
  		 */
  val `type`: ground | input | typings.arcgisJsApi.arcgisJsApiStrings.query | view = js.native
  
  /**
  		 * Whether a line visualization representing [elevationSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#samples) should be added to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#viewVisualizationEnabled)
  		 */
  var viewVisualizationEnabled: Boolean = js.native
  
  /**
  		 * Whether the line should be computed and shown in the chart.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#visible)
  		 */
  var visible: Boolean = js.native
}
