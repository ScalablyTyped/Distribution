package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultHyperParameterRanges extends StObject {
  
  /**
    * The categorical hyperparameters and their default ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.undefined
  
  /**
    * The continuous hyperparameters and their default ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.undefined
  
  /**
    * The integer-valued hyperparameters and their default ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.undefined
}
object DefaultHyperParameterRanges {
  
  inline def apply(): DefaultHyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultHyperParameterRanges]
  }
  
  extension [Self <: DefaultHyperParameterRanges](x: Self) {
    
    inline def setCategoricalHyperParameterRanges(value: DefaultCategoricalHyperParameterRanges): Self = StObject.set(x, "categoricalHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setCategoricalHyperParameterRangesUndefined: Self = StObject.set(x, "categoricalHyperParameterRanges", js.undefined)
    
    inline def setCategoricalHyperParameterRangesVarargs(value: DefaultCategoricalHyperParameterRange*): Self = StObject.set(x, "categoricalHyperParameterRanges", js.Array(value*))
    
    inline def setContinuousHyperParameterRanges(value: DefaultContinuousHyperParameterRanges): Self = StObject.set(x, "continuousHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setContinuousHyperParameterRangesUndefined: Self = StObject.set(x, "continuousHyperParameterRanges", js.undefined)
    
    inline def setContinuousHyperParameterRangesVarargs(value: DefaultContinuousHyperParameterRange*): Self = StObject.set(x, "continuousHyperParameterRanges", js.Array(value*))
    
    inline def setIntegerHyperParameterRanges(value: DefaultIntegerHyperParameterRanges): Self = StObject.set(x, "integerHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setIntegerHyperParameterRangesUndefined: Self = StObject.set(x, "integerHyperParameterRanges", js.undefined)
    
    inline def setIntegerHyperParameterRangesVarargs(value: DefaultIntegerHyperParameterRange*): Self = StObject.set(x, "integerHyperParameterRanges", js.Array(value*))
  }
}
