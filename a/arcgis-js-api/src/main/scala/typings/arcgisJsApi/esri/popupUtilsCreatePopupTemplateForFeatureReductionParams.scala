package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait popupUtilsCreatePopupTemplateForFeatureReductionParams extends StObject {
  
  /**
    * The FeatureReduction object for which to create a default popup template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createPopupTemplateForFeatureReduction)
    */
  var featureReduction: FeatureReductionBinning | FeatureReductionCluster
  
  /**
    * The fields of the layer aggregated during the feature reduction process.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createPopupTemplateForFeatureReduction)
    */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  /**
    * The title to display in the popup template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createPopupTemplateForFeatureReduction)
    */
  var title: js.UndefOr[String] = js.undefined
}
object popupUtilsCreatePopupTemplateForFeatureReductionParams {
  
  inline def apply(featureReduction: FeatureReductionBinning | FeatureReductionCluster): popupUtilsCreatePopupTemplateForFeatureReductionParams = {
    val __obj = js.Dynamic.literal(featureReduction = featureReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[popupUtilsCreatePopupTemplateForFeatureReductionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: popupUtilsCreatePopupTemplateForFeatureReductionParams] (val x: Self) extends AnyVal {
    
    inline def setFeatureReduction(value: FeatureReductionBinning | FeatureReductionCluster): Self = StObject.set(x, "featureReduction", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
