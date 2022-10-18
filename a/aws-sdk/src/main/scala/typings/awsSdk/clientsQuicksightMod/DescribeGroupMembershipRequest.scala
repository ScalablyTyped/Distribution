package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupMembershipRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the group is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The name of the group that you want to search.
    */
  var GroupName: typings.awsSdk.clientsQuicksightMod.GroupName
  
  /**
    * The user name of the user that you want to search for.
    */
  var MemberName: GroupMemberName
  
  /**
    * The namespace that includes the group you are searching within.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
}
object DescribeGroupMembershipRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    MemberName: GroupMemberName,
    Namespace: Namespace
  ): DescribeGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupMembershipRequest]
  }
  
  extension [Self <: DescribeGroupMembershipRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setMemberName(value: GroupMemberName): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
