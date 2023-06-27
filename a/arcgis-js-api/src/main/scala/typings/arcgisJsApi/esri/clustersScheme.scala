package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait clustersScheme extends StObject {
  
  /**
  		 * The suggested [featureReduction.clusterMinSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize) required to fit labels within clusters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
  		 */
  var clusterMinSize: Double
  
  /**
  		 * The name of the aggregate field the labeling scheme is based on.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
  		 */
  var fieldName: String
  
  /**
  		 * An array of LabelClass objects to set on the layer's [featureReduction.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
  		 */
  var labelingInfo: js.Array[LabelClass]
  
  /**
  		 * The name of the generated cluster labeling scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
  		 */
  var name: String
}
object clustersScheme {
  
  inline def apply(clusterMinSize: Double, fieldName: String, labelingInfo: js.Array[LabelClass], name: String): clustersScheme = {
    val __obj = js.Dynamic.literal(clusterMinSize = clusterMinSize.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], labelingInfo = labelingInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[clustersScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: clustersScheme] (val x: Self) extends AnyVal {
    
    inline def setClusterMinSize(value: Double): Self = StObject.set(x, "clusterMinSize", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfo(value: js.Array[LabelClass]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoVarargs(value: LabelClass*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
