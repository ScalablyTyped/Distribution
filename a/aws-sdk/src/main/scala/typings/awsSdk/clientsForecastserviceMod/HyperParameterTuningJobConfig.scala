package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobConfig extends StObject {
  
  /**
    * Specifies the ranges of valid values for the hyperparameters.
    */
  var ParameterRanges: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ParameterRanges] = js.undefined
}
object HyperParameterTuningJobConfig {
  
  inline def apply(): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperParameterTuningJobConfig] (val x: Self) extends AnyVal {
    
    inline def setParameterRanges(value: ParameterRanges): Self = StObject.set(x, "ParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setParameterRangesUndefined: Self = StObject.set(x, "ParameterRanges", js.undefined)
  }
}
