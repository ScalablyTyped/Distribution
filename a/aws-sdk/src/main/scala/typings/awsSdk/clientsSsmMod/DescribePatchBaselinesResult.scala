package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchBaselinesResult extends StObject {
  
  /**
    * An array of PatchBaselineIdentity elements.
    */
  var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribePatchBaselinesResult {
  
  inline def apply(): DescribePatchBaselinesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchBaselinesResult]
  }
  
  extension [Self <: DescribePatchBaselinesResult](x: Self) {
    
    inline def setBaselineIdentities(value: PatchBaselineIdentityList): Self = StObject.set(x, "BaselineIdentities", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdentitiesUndefined: Self = StObject.set(x, "BaselineIdentities", js.undefined)
    
    inline def setBaselineIdentitiesVarargs(value: PatchBaselineIdentity*): Self = StObject.set(x, "BaselineIdentities", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
