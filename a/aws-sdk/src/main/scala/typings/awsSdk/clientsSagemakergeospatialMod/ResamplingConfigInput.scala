package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResamplingConfigInput extends StObject {
  
  /**
    * The name of the algorithm used for resampling.
    */
  var AlgorithmName: js.UndefOr[AlgorithmNameResampling] = js.undefined
  
  /**
    * The structure representing output resolution (in target georeferenced units) of the result of resampling operation.
    */
  var OutputResolution: OutputResolutionResamplingInput
  
  /**
    * Bands used in the operation. If no target bands are specified, it uses all bands available in the input.
    */
  var TargetBands: js.UndefOr[StringListInput] = js.undefined
}
object ResamplingConfigInput {
  
  inline def apply(OutputResolution: OutputResolutionResamplingInput): ResamplingConfigInput = {
    val __obj = js.Dynamic.literal(OutputResolution = OutputResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResamplingConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResamplingConfigInput] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmName(value: AlgorithmNameResampling): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    inline def setOutputResolution(value: OutputResolutionResamplingInput): Self = StObject.set(x, "OutputResolution", value.asInstanceOf[js.Any])
    
    inline def setTargetBands(value: StringListInput): Self = StObject.set(x, "TargetBands", value.asInstanceOf[js.Any])
    
    inline def setTargetBandsUndefined: Self = StObject.set(x, "TargetBands", js.undefined)
    
    inline def setTargetBandsVarargs(value: String*): Self = StObject.set(x, "TargetBands", js.Array(value*))
  }
}
