package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportErrorsRequest extends StObject {
  
  /**
    * List import errors request import id.
    */
  var importID: ImportID
  
  /**
    * List import errors request max results.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * List import errors request next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportErrorsRequest {
  
  inline def apply(importID: ImportID): ListImportErrorsRequest = {
    val __obj = js.Dynamic.literal(importID = importID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportErrorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportErrorsRequest] (val x: Self) extends AnyVal {
    
    inline def setImportID(value: ImportID): Self = StObject.set(x, "importID", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
