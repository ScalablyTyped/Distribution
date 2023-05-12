package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RescoreRequest extends StObject {
  
  /**
    * The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
    */
  var Documents: DocumentList
  
  /**
    * The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  var RescoreExecutionPlanId: typings.awsSdk.clientsKendrarankingMod.RescoreExecutionPlanId
  
  /**
    * The input query from the search service.
    */
  var SearchQuery: typings.awsSdk.clientsKendrarankingMod.SearchQuery
}
object RescoreRequest {
  
  inline def apply(Documents: DocumentList, RescoreExecutionPlanId: RescoreExecutionPlanId, SearchQuery: SearchQuery): RescoreRequest = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], RescoreExecutionPlanId = RescoreExecutionPlanId.asInstanceOf[js.Any], SearchQuery = SearchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[RescoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RescoreRequest] (val x: Self) extends AnyVal {
    
    inline def setDocuments(value: DocumentList): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: Document*): Self = StObject.set(x, "Documents", js.Array(value*))
    
    inline def setRescoreExecutionPlanId(value: RescoreExecutionPlanId): Self = StObject.set(x, "RescoreExecutionPlanId", value.asInstanceOf[js.Any])
    
    inline def setSearchQuery(value: SearchQuery): Self = StObject.set(x, "SearchQuery", value.asInstanceOf[js.Any])
  }
}
