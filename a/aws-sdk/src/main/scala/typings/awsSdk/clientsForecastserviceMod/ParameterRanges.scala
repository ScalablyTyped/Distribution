package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRanges extends StObject {
  
  /**
    * Specifies the tunable range for each categorical hyperparameter.
    */
  var CategoricalParameterRanges: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.CategoricalParameterRanges] = js.undefined
  
  /**
    * Specifies the tunable range for each continuous hyperparameter.
    */
  var ContinuousParameterRanges: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ContinuousParameterRanges] = js.undefined
  
  /**
    * Specifies the tunable range for each integer hyperparameter.
    */
  var IntegerParameterRanges: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.IntegerParameterRanges] = js.undefined
}
object ParameterRanges {
  
  inline def apply(): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterRanges] (val x: Self) extends AnyVal {
    
    inline def setCategoricalParameterRanges(value: CategoricalParameterRanges): Self = StObject.set(x, "CategoricalParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setCategoricalParameterRangesUndefined: Self = StObject.set(x, "CategoricalParameterRanges", js.undefined)
    
    inline def setCategoricalParameterRangesVarargs(value: CategoricalParameterRange*): Self = StObject.set(x, "CategoricalParameterRanges", js.Array(value*))
    
    inline def setContinuousParameterRanges(value: ContinuousParameterRanges): Self = StObject.set(x, "ContinuousParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setContinuousParameterRangesUndefined: Self = StObject.set(x, "ContinuousParameterRanges", js.undefined)
    
    inline def setContinuousParameterRangesVarargs(value: ContinuousParameterRange*): Self = StObject.set(x, "ContinuousParameterRanges", js.Array(value*))
    
    inline def setIntegerParameterRanges(value: IntegerParameterRanges): Self = StObject.set(x, "IntegerParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setIntegerParameterRangesUndefined: Self = StObject.set(x, "IntegerParameterRanges", js.undefined)
    
    inline def setIntegerParameterRangesVarargs(value: IntegerParameterRange*): Self = StObject.set(x, "IntegerParameterRanges", js.Array(value*))
  }
}
