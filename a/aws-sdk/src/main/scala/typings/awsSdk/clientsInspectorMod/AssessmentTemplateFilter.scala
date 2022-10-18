package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentTemplateFilter extends StObject {
  
  /**
    * For a record to match a filter, the value specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentTemplate data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.undefined
  
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTemplateName property of the AssessmentTemplate data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.undefined
  
  /**
    * For a record to match a filter, the values that are specified for this data type property must be contained in the list of values of the rulesPackageArns property of the AssessmentTemplate data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
}
object AssessmentTemplateFilter {
  
  inline def apply(): AssessmentTemplateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTemplateFilter]
  }
  
  extension [Self <: AssessmentTemplateFilter](x: Self) {
    
    inline def setDurationRange(value: DurationRange): Self = StObject.set(x, "durationRange", value.asInstanceOf[js.Any])
    
    inline def setDurationRangeUndefined: Self = StObject.set(x, "durationRange", js.undefined)
    
    inline def setNamePattern(value: NamePattern): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    inline def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
    
    inline def setRulesPackageArns(value: FilterRulesPackageArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArnsUndefined: Self = StObject.set(x, "rulesPackageArns", js.undefined)
    
    inline def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value*))
  }
}
