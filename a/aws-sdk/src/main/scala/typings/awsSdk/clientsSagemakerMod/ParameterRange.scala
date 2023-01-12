package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRange extends StObject {
  
  /**
    * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
    */
  var CategoricalParameterRangeSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CategoricalParameterRangeSpecification] = js.undefined
  
  /**
    * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
    */
  var ContinuousParameterRangeSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContinuousParameterRangeSpecification] = js.undefined
  
  /**
    * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
    */
  var IntegerParameterRangeSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.IntegerParameterRangeSpecification] = js.undefined
}
object ParameterRange {
  
  inline def apply(): ParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterRange] (val x: Self) extends AnyVal {
    
    inline def setCategoricalParameterRangeSpecification(value: CategoricalParameterRangeSpecification): Self = StObject.set(x, "CategoricalParameterRangeSpecification", value.asInstanceOf[js.Any])
    
    inline def setCategoricalParameterRangeSpecificationUndefined: Self = StObject.set(x, "CategoricalParameterRangeSpecification", js.undefined)
    
    inline def setContinuousParameterRangeSpecification(value: ContinuousParameterRangeSpecification): Self = StObject.set(x, "ContinuousParameterRangeSpecification", value.asInstanceOf[js.Any])
    
    inline def setContinuousParameterRangeSpecificationUndefined: Self = StObject.set(x, "ContinuousParameterRangeSpecification", js.undefined)
    
    inline def setIntegerParameterRangeSpecification(value: IntegerParameterRangeSpecification): Self = StObject.set(x, "IntegerParameterRangeSpecification", value.asInstanceOf[js.Any])
    
    inline def setIntegerParameterRangeSpecificationUndefined: Self = StObject.set(x, "IntegerParameterRangeSpecification", js.undefined)
  }
}
