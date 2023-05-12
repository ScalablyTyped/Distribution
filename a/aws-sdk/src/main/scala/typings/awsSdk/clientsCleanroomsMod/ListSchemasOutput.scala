package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasOutput extends StObject {
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The retrieved list of schemas.
    */
  var schemaSummaries: SchemaSummaryList
}
object ListSchemasOutput {
  
  inline def apply(schemaSummaries: SchemaSummaryList): ListSchemasOutput = {
    val __obj = js.Dynamic.literal(schemaSummaries = schemaSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSchemasOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSchemaSummaries(value: SchemaSummaryList): Self = StObject.set(x, "schemaSummaries", value.asInstanceOf[js.Any])
    
    inline def setSchemaSummariesVarargs(value: SchemaSummary*): Self = StObject.set(x, "schemaSummaries", js.Array(value*))
  }
}
