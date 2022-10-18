package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the group is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A description for the group that you want to create.
    */
  var Description: js.UndefOr[GroupDescription] = js.undefined
  
  /**
    * A name for the group that you want to create.
    */
  var GroupName: typings.awsSdk.clientsQuicksightMod.GroupName
  
  /**
    * The namespace that you want the group to be a part of.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
}
object CreateGroupRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, GroupName: GroupName, Namespace: Namespace): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  
  extension [Self <: CreateGroupRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: GroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
