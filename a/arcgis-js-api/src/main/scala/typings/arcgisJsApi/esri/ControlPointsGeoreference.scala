package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`control-points`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlPointsGeoreference
  extends StObject
     with Accessor {
  
  /**
  		 * An array of two, three, or four [controlPoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#controlPoints) positions the media element.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#controlPoints)
  		 */
  var controlPoints: js.Array[ControlPoint] = js.native
  
  /**
  		 * Defines the size of the element displayed, typically the element's height in pixels.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#height)
  		 */
  var height: Double = js.native
  
  /**
  		 * Converts the given [sourcePoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#SourcePoint) to a [mapPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#toMap)
  		 */
  def toMap(sourcePoint: SourcePoint): Point = js.native
  
  /**
  		 * Converts the given [mapPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) to a [sourcePoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#SourcePoint).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#toSource)
  		 */
  def toSource(point: Point): SourcePoint = js.native
  
  var `type`: `control-points` = js.native
  
  /**
  		 * Defines the size of the element displayed, typically the element's width in pixels.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#width)
  		 */
  var width: Double = js.native
}
