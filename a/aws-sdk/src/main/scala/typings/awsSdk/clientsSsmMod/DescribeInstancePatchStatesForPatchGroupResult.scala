package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancePatchStatesForPatchGroupResult extends StObject {
  
  /**
    * The high-level patch state for the requested managed nodes. 
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeInstancePatchStatesForPatchGroupResult {
  
  inline def apply(): DescribeInstancePatchStatesForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
  }
  
  extension [Self <: DescribeInstancePatchStatesForPatchGroupResult](x: Self) {
    
    inline def setInstancePatchStates(value: InstancePatchStatesList): Self = StObject.set(x, "InstancePatchStates", value.asInstanceOf[js.Any])
    
    inline def setInstancePatchStatesUndefined: Self = StObject.set(x, "InstancePatchStates", js.undefined)
    
    inline def setInstancePatchStatesVarargs(value: InstancePatchState*): Self = StObject.set(x, "InstancePatchStates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
