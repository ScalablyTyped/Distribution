package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralLabelsSettings extends StObject {
  
  /**
    * The label categories that should be excluded from the return from DetectLabels.
    */
  var LabelCategoryExclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined
  
  /**
    * The label categories that should be included in the return from DetectLabels.
    */
  var LabelCategoryInclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined
  
  /**
    * The labels that should be excluded from the return from DetectLabels.
    */
  var LabelExclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined
  
  /**
    * The labels that should be included in the return from DetectLabels.
    */
  var LabelInclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined
}
object GeneralLabelsSettings {
  
  inline def apply(): GeneralLabelsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralLabelsSettings]
  }
  
  extension [Self <: GeneralLabelsSettings](x: Self) {
    
    inline def setLabelCategoryExclusionFilters(value: GeneralLabelsFilterList): Self = StObject.set(x, "LabelCategoryExclusionFilters", value.asInstanceOf[js.Any])
    
    inline def setLabelCategoryExclusionFiltersUndefined: Self = StObject.set(x, "LabelCategoryExclusionFilters", js.undefined)
    
    inline def setLabelCategoryExclusionFiltersVarargs(value: GeneralLabelsFilterValue*): Self = StObject.set(x, "LabelCategoryExclusionFilters", js.Array(value*))
    
    inline def setLabelCategoryInclusionFilters(value: GeneralLabelsFilterList): Self = StObject.set(x, "LabelCategoryInclusionFilters", value.asInstanceOf[js.Any])
    
    inline def setLabelCategoryInclusionFiltersUndefined: Self = StObject.set(x, "LabelCategoryInclusionFilters", js.undefined)
    
    inline def setLabelCategoryInclusionFiltersVarargs(value: GeneralLabelsFilterValue*): Self = StObject.set(x, "LabelCategoryInclusionFilters", js.Array(value*))
    
    inline def setLabelExclusionFilters(value: GeneralLabelsFilterList): Self = StObject.set(x, "LabelExclusionFilters", value.asInstanceOf[js.Any])
    
    inline def setLabelExclusionFiltersUndefined: Self = StObject.set(x, "LabelExclusionFilters", js.undefined)
    
    inline def setLabelExclusionFiltersVarargs(value: GeneralLabelsFilterValue*): Self = StObject.set(x, "LabelExclusionFilters", js.Array(value*))
    
    inline def setLabelInclusionFilters(value: GeneralLabelsFilterList): Self = StObject.set(x, "LabelInclusionFilters", value.asInstanceOf[js.Any])
    
    inline def setLabelInclusionFiltersUndefined: Self = StObject.set(x, "LabelInclusionFilters", js.undefined)
    
    inline def setLabelInclusionFiltersVarargs(value: GeneralLabelsFilterValue*): Self = StObject.set(x, "LabelInclusionFilters", js.Array(value*))
  }
}
