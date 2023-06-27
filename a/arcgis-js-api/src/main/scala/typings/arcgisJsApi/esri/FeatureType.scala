package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureType
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Domains associated with the feature type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#domains)
  		 */
  var domains: HashMap[CodedValueDomain | RangeDomain | InheritedDomain] = js.native
  
  /**
  		 * The feature type identifier.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#id)
  		 */
  var id: Double | String = js.native
  
  /**
  		 * The feature type name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * Array of [feature templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) associated with the feature type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#templates)
  		 */
  var templates: js.Array[FeatureTemplate] = js.native
}
