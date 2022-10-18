package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchPropertiesResult extends StObject {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * A list of the properties for patches matching the filter request parameters.
    */
  var Properties: js.UndefOr[PatchPropertiesList] = js.undefined
}
object DescribePatchPropertiesResult {
  
  inline def apply(): DescribePatchPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchPropertiesResult]
  }
  
  extension [Self <: DescribePatchPropertiesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProperties(value: PatchPropertiesList): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setPropertiesVarargs(value: PatchPropertyEntry*): Self = StObject.set(x, "Properties", js.Array(value*))
  }
}
