package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessGroupsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the Verified Access group.
    */
  var VerifiedAccessGroups: js.UndefOr[VerifiedAccessGroupList] = js.undefined
}
object DescribeVerifiedAccessGroupsResult {
  
  inline def apply(): DescribeVerifiedAccessGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessGroupsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessGroupsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessGroups(value: VerifiedAccessGroupList): Self = StObject.set(x, "VerifiedAccessGroups", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupsUndefined: Self = StObject.set(x, "VerifiedAccessGroups", js.undefined)
    
    inline def setVerifiedAccessGroupsVarargs(value: VerifiedAccessGroup*): Self = StObject.set(x, "VerifiedAccessGroups", js.Array(value*))
  }
}
