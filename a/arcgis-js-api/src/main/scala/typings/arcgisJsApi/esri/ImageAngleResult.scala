package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAngleResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The computed north angle after rotating the map so the top of the image is oriented toward north.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html#north)
  		 */
  var north: Double = js.native
  
  /**
  		 * The spatial reference used to compute the angles.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
  
  /**
  		 * The computed up angle after rotating the map so the top of the image is always oriented to the direction of the sensor when it acquired the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html#up)
  		 */
  var up: Double = js.native
}
