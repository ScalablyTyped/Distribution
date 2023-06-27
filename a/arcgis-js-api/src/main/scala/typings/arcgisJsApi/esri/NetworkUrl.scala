package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkUrl
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * If true, restricted network elements should be considered when finding network locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkUrl.html#doNotLocateOnRestrictedElements)
  		 */
  var doNotLocateOnRestrictedElements: Boolean = js.native
  
  /**
  		 * A url to any ArcGIS Server feature, map, or geoprocessing service that returns a JSON feature set.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkUrl.html#url)
  		 */
  var url: String = js.native
}
