package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHITsForQualificationTypeRequest extends StObject {
  
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The ID of the Qualification type to use when querying HITs. 
    */
  var QualificationTypeId: EntityId
}
object ListHITsForQualificationTypeRequest {
  
  inline def apply(QualificationTypeId: EntityId): ListHITsForQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsForQualificationTypeRequest]
  }
  
  extension [Self <: ListHITsForQualificationTypeRequest](x: Self) {
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
  }
}
