package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancePatchStatesForPatchGroupRequest extends StObject {
  
  /**
    * Each entry in the array is a structure containing:   Key (string between 1 and 200 characters)   Values (array containing a single string)   Type (string "Equal", "NotEqual", "LessThan", "GreaterThan")  
    */
  var Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined
  
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * The name of the patch group for which the patch state information should be retrieved.
    */
  var PatchGroup: typings.awsSdk.clientsSsmMod.PatchGroup
}
object DescribeInstancePatchStatesForPatchGroupRequest {
  
  inline def apply(PatchGroup: PatchGroup): DescribeInstancePatchStatesForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
  }
  
  extension [Self <: DescribeInstancePatchStatesForPatchGroupRequest](x: Self) {
    
    inline def setFilters(value: InstancePatchStateFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: InstancePatchStateFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: PatchComplianceMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
