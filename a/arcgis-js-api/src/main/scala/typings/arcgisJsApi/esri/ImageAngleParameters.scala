package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAngleParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Angle names to be computed.
  		 *
  		 * @default ["north","up"]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#angleNames)
  		 */
  var angleNames: js.Array[String] = js.native
  
  /**
  		 * A [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry that defines the reference point of rotation to compute the angle direction.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#point)
  		 */
  var point: Point = js.native
  
  /**
  		 * The rasterId of a raster catalog in the image service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#rasterId)
  		 */
  var rasterId: Double = js.native
  
  /**
  		 * The spatial reference used to compute the angles.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
}
