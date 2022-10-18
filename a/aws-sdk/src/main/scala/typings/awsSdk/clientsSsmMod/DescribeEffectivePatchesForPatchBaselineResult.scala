package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEffectivePatchesForPatchBaselineResult extends StObject {
  
  /**
    * An array of patches and patch status.
    */
  var EffectivePatches: js.UndefOr[EffectivePatchList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeEffectivePatchesForPatchBaselineResult {
  
  inline def apply(): DescribeEffectivePatchesForPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
  }
  
  extension [Self <: DescribeEffectivePatchesForPatchBaselineResult](x: Self) {
    
    inline def setEffectivePatches(value: EffectivePatchList): Self = StObject.set(x, "EffectivePatches", value.asInstanceOf[js.Any])
    
    inline def setEffectivePatchesUndefined: Self = StObject.set(x, "EffectivePatches", js.undefined)
    
    inline def setEffectivePatchesVarargs(value: EffectivePatch*): Self = StObject.set(x, "EffectivePatches", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
