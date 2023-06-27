package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains helper methods for generating popup templates to be set on a layer's [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html)
	 */
trait popupClusters extends StObject {
  
  /**
  		 * Returns one or more suggested default [popupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for a given layer's [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate) configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html#getTemplates)
  		 */
  def getTemplates(params: clustersGetTemplatesParams): js.Promise[Templates_]
}
object popupClusters {
  
  inline def apply(getTemplates: clustersGetTemplatesParams => js.Promise[Templates_]): popupClusters = {
    val __obj = js.Dynamic.literal(getTemplates = js.Any.fromFunction1(getTemplates))
    __obj.asInstanceOf[popupClusters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: popupClusters] (val x: Self) extends AnyVal {
    
    inline def setGetTemplates(value: clustersGetTemplatesParams => js.Promise[Templates_]): Self = StObject.set(x, "getTemplates", js.Any.fromFunction1(value))
  }
}
