package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageIdentifyResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The set of visible areas for the identified catalog items.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#catalogItemVisibilities)
  		 */
  var catalogItemVisibilities: js.Array[Double] = js.native
  
  /**
  		 * The set of catalog items that overlap the input geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#catalogItems)
  		 */
  var catalogItems: FeatureSet = js.native
  
  /**
  		 * The identified location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#location)
  		 */
  var location: Point = js.native
  
  /**
  		 * The identify property name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * The identify property id.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#objectId)
  		 */
  var objectId: Double = js.native
  
  /**
  		 * The attributes of the identified object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#properties)
  		 */
  var properties: Any = js.native
  
  /**
  		 * The identify image service pixel value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html#value)
  		 */
  var value: String = js.native
}
