package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPrincipalMappingRequest extends StObject {
  
  /**
    * The identifier of the data source you want to map users to their groups. This is useful if a group is tied to multiple data sources, but you only want the group to access documents of a certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team only needs access to customer-related documents stored in Salesforce.
    */
  var DataSourceId: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceId] = js.undefined
  
  /**
    * The identifier of the group you want to map its users to.
    */
  var GroupId: typings.awsSdk.clientsKendraMod.GroupId
  
  /**
    * The list that contains your users or sub groups that belong the same group. For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and "Sales and Marketing". If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
    */
  var GroupMembers: typings.awsSdk.clientsKendraMod.GroupMembers
  
  /**
    * The identifier of the index you want to map users to their groups.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest PUT action with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to process and apply on top of other actions with lower number IDs. This prevents previous actions with lower number IDs from possibly overriding the latest action. The ordering ID can be the Unix time of the last update you made to a group members list. You would then provide this list when calling PutPrincipalMapping. This ensures your PUT action for that updated group with the latest members list doesn't get overwritten by earlier PUT actions for the same group which are yet to be processed. The default ordering ID is the current Unix time in milliseconds that the action was received by Amazon Kendra.
    */
  var OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users or sub groups that belong to a group. For more information, see IAM roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
}
object PutPrincipalMappingRequest {
  
  inline def apply(GroupId: GroupId, GroupMembers: GroupMembers, IndexId: IndexId): PutPrincipalMappingRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], GroupMembers = GroupMembers.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPrincipalMappingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPrincipalMappingRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupMembers(value: GroupMembers): Self = StObject.set(x, "GroupMembers", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setOrderingId(value: PrincipalOrderingId): Self = StObject.set(x, "OrderingId", value.asInstanceOf[js.Any])
    
    inline def setOrderingIdUndefined: Self = StObject.set(x, "OrderingId", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
