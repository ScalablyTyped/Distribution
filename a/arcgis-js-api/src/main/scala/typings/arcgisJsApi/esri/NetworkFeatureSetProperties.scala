package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFeatureSetProperties
  extends StObject
     with FeatureSetProperties {
  
  /**
    * If true, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkFeatureSet.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.undefined
}
object NetworkFeatureSetProperties {
  
  inline def apply(): NetworkFeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFeatureSetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkFeatureSetProperties] (val x: Self) extends AnyVal {
    
    inline def setDoNotLocateOnRestrictedElements(value: Boolean): Self = StObject.set(x, "doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    inline def setDoNotLocateOnRestrictedElementsUndefined: Self = StObject.set(x, "doNotLocateOnRestrictedElements", js.undefined)
  }
}
