package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFeatureSet
  extends StObject
     with FeatureSet {
  
  /**
  		 * If true, restricted network elements should be considered when finding network locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkFeatureSet.html#doNotLocateOnRestrictedElements)
  		 */
  var doNotLocateOnRestrictedElements: Boolean = js.native
}
