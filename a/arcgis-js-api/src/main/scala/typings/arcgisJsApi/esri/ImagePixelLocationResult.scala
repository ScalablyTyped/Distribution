package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePixelLocationResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * An array of objects containing pixel space x,y coordinates and the pixel's z values of the pixel location geometries.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationResult.html#geometries)
  		 */
  var geometries: js.Array[Any] = js.native
}
