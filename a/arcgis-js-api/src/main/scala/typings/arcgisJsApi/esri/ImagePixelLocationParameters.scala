package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePixelLocationParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * An array of [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) that defines pixel locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html#point)
  		 */
  var point: js.Array[Point] = js.native
  
  /**
  		 * The rasterId of a raster catalog in the image service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html#rasterId)
  		 */
  var rasterId: Double = js.native
}
