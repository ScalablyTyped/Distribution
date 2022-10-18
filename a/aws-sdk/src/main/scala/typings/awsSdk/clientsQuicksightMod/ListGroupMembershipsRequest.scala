package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupMembershipsRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the group is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The name of the group that you want to see a membership list of.
    */
  var GroupName: typings.awsSdk.clientsQuicksightMod.GroupName
  
  /**
    * The maximum number of results to return from this request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MaxResults] = js.undefined
  
  /**
    * The namespace of the group that you want a list of users from.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListGroupMembershipsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, GroupName: GroupName, Namespace: Namespace): ListGroupMembershipsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembershipsRequest]
  }
  
  extension [Self <: ListGroupMembershipsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
