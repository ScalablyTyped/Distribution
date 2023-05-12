package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePrincipalMappingResponse extends StObject {
  
  /**
    * Shows the identifier of the data source to see information on the processing of PUT and DELETE actions for mapping users to their groups.
    */
  var DataSourceId: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceId] = js.undefined
  
  /**
    * Shows the identifier of the group to see information on the processing of PUT and DELETE actions for mapping users to their groups.
    */
  var GroupId: js.UndefOr[typings.awsSdk.clientsKendraMod.GroupId] = js.undefined
  
  /**
    * Shows the following information on the processing of PUT and DELETE actions for mapping users to their groups:   Status—the status can be either PROCESSING, SUCCEEDED, DELETING, DELETED, or FAILED.   Last updated—the last date-time an action was updated.   Received—the last date-time an action was received or submitted.   Ordering ID—the latest action that should process and apply after other actions.   Failure reason—the reason an action could not be processed.  
    */
  var GroupOrderingIdSummaries: js.UndefOr[typings.awsSdk.clientsKendraMod.GroupOrderingIdSummaries] = js.undefined
  
  /**
    * Shows the identifier of the index to see information on the processing of PUT and DELETE actions for mapping users to their groups.
    */
  var IndexId: js.UndefOr[typings.awsSdk.clientsKendraMod.IndexId] = js.undefined
}
object DescribePrincipalMappingResponse {
  
  inline def apply(): DescribePrincipalMappingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrincipalMappingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePrincipalMappingResponse] (val x: Self) extends AnyVal {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupOrderingIdSummaries(value: GroupOrderingIdSummaries): Self = StObject.set(x, "GroupOrderingIdSummaries", value.asInstanceOf[js.Any])
    
    inline def setGroupOrderingIdSummariesUndefined: Self = StObject.set(x, "GroupOrderingIdSummaries", js.undefined)
    
    inline def setGroupOrderingIdSummariesVarargs(value: GroupOrderingIdSummary*): Self = StObject.set(x, "GroupOrderingIdSummaries", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
  }
}
