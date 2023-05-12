package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandMathConfigInput extends StObject {
  
  /**
    * CustomIndices that are computed.
    */
  var CustomIndices: js.UndefOr[CustomIndicesInput] = js.undefined
  
  /**
    * One or many of the supported predefined indices to compute. Allowed values: NDVI, EVI2, MSAVI, NDWI, NDMI, NDSI, and WDRVI.
    */
  var PredefinedIndices: js.UndefOr[StringListInput] = js.undefined
}
object BandMathConfigInput {
  
  inline def apply(): BandMathConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandMathConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BandMathConfigInput] (val x: Self) extends AnyVal {
    
    inline def setCustomIndices(value: CustomIndicesInput): Self = StObject.set(x, "CustomIndices", value.asInstanceOf[js.Any])
    
    inline def setCustomIndicesUndefined: Self = StObject.set(x, "CustomIndices", js.undefined)
    
    inline def setPredefinedIndices(value: StringListInput): Self = StObject.set(x, "PredefinedIndices", value.asInstanceOf[js.Any])
    
    inline def setPredefinedIndicesUndefined: Self = StObject.set(x, "PredefinedIndices", js.undefined)
    
    inline def setPredefinedIndicesVarargs(value: String*): Self = StObject.set(x, "PredefinedIndices", js.Array(value*))
  }
}
