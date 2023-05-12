package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComputeOutput extends StObject {
  
  /**
    * A list of compute resources registered to the fleet you specified.
    */
  var ComputeList: js.UndefOr[typings.awsSdk.clientsGameliftMod.ComputeList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListComputeOutput {
  
  inline def apply(): ListComputeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComputeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComputeOutput] (val x: Self) extends AnyVal {
    
    inline def setComputeList(value: ComputeList): Self = StObject.set(x, "ComputeList", value.asInstanceOf[js.Any])
    
    inline def setComputeListUndefined: Self = StObject.set(x, "ComputeList", js.undefined)
    
    inline def setComputeListVarargs(value: Compute*): Self = StObject.set(x, "ComputeList", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
