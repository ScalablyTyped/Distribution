package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheme extends StObject {
  
  /**
  		 * The name of the aggregate field used in the labeling scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#Scheme)
  		 */
  var fieldName: String
  
  /**
  		 * An array of LabelClass objects to set on the layer's [featureReduction.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#labelingInfo) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#Scheme)
  		 */
  var labelingInfo: js.Array[LabelClass]
  
  /**
  		 * The name of the generated binning labeling scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#Scheme)
  		 */
  var name: String
}
object Scheme {
  
  inline def apply(fieldName: String, labelingInfo: js.Array[LabelClass], name: String): Scheme = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], labelingInfo = labelingInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scheme] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfo(value: js.Array[LabelClass]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoVarargs(value: LabelClass*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
