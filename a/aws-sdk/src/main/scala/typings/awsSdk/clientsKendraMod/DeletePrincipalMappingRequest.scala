package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePrincipalMappingRequest extends StObject {
  
  /**
    * The identifier of the data source you want to delete a group from. A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and Salesforce. You want to delete "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
    */
  var DataSourceId: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceId] = js.undefined
  
  /**
    * The identifier of the group you want to delete.
    */
  var GroupId: typings.awsSdk.clientsKendraMod.GroupId
  
  /**
    * The identifier of the index you want to delete a group from.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest DELETE action with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to process and apply on top of other actions with lower number IDs. This prevents previous actions with lower number IDs from possibly overriding the latest action. The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide this list when calling PutPrincipalMapping. This ensures your DELETE action for that updated group with the latest members list doesn't get overwritten by earlier DELETE actions for the same group which are yet to be processed. The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra. 
    */
  var OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined
}
object DeletePrincipalMappingRequest {
  
  inline def apply(GroupId: GroupId, IndexId: IndexId): DeletePrincipalMappingRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePrincipalMappingRequest]
  }
  
  extension [Self <: DeletePrincipalMappingRequest](x: Self) {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setOrderingId(value: PrincipalOrderingId): Self = StObject.set(x, "OrderingId", value.asInstanceOf[js.Any])
    
    inline def setOrderingIdUndefined: Self = StObject.set(x, "OrderingId", js.undefined)
  }
}
