package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkersWithQualificationTypeRequest extends StObject {
  
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the Qualification type of the Qualifications to return.
    */
  var QualificationTypeId: EntityId
  
  /**
    *  The status of the Qualifications to return. Can be Granted | Revoked. 
    */
  var Status: js.UndefOr[QualificationStatus] = js.undefined
}
object ListWorkersWithQualificationTypeRequest {
  
  inline def apply(QualificationTypeId: EntityId): ListWorkersWithQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersWithQualificationTypeRequest]
  }
  
  extension [Self <: ListWorkersWithQualificationTypeRequest](x: Self) {
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: QualificationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
