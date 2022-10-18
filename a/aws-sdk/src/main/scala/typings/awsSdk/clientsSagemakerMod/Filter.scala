package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * A resource property name. For example, TrainingJobName. For valid property names, see SearchRecord. You must specify a valid property for the resource.
    */
  var Name: ResourcePropertyName
  
  /**
    * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following values:  Equals  The value of Name equals Value.  NotEquals  The value of Name doesn't equal Value.  Exists  The Name property exists.  NotExists  The Name property does not exist.  GreaterThan  The value of Name is greater than Value. Not supported for text properties.  GreaterThanOrEqualTo  The value of Name is greater than or equal to Value. Not supported for text properties.  LessThan  The value of Name is less than Value. Not supported for text properties.  LessThanOrEqualTo  The value of Name is less than or equal to Value. Not supported for text properties.  In  The value of Name is one of the comma delimited strings in Value. Only supported for text properties.  Contains  The value of Name contains the string Value. Only supported for text properties. A SearchExpression can include the Contains operator multiple times when the value of Name is one of the following:    Experiment.DisplayName     Experiment.ExperimentName     Experiment.Tags     Trial.DisplayName     Trial.TrialName     Trial.Tags     TrialComponent.DisplayName     TrialComponent.TrialComponentName     TrialComponent.Tags     TrialComponent.InputArtifacts     TrialComponent.OutputArtifacts    A SearchExpression can include only one Contains operator for all other values of Name. In these cases, if you include multiple Contains operators in the SearchExpression, the result is the following error message: "'CONTAINS' operator usage limit of 1 exceeded."  
    */
  var Operator: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Operator] = js.undefined
  
  /**
    * A value used with Name and Operator to determine which resources satisfy the filter's condition. For numerical properties, Value must be an integer or floating-point decimal. For timestamp properties, Value must be an ISO 8601 date-time string of the following format: YYYY-mm-dd'T'HH:MM:SS.
    */
  var Value: js.UndefOr[FilterValue] = js.undefined
}
object Filter {
  
  inline def apply(Name: ResourcePropertyName): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setName(value: ResourcePropertyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setValue(value: FilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
