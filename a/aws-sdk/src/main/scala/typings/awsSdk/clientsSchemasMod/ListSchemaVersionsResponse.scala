package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemaVersionsResponse extends StObject {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSchemaVersionSummary] = js.undefined
}
object ListSchemaVersionsResponse {
  
  inline def apply(): ListSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSchemaVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaVersions(value: listOfSchemaVersionSummary): Self = StObject.set(x, "SchemaVersions", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionsUndefined: Self = StObject.set(x, "SchemaVersions", js.undefined)
    
    inline def setSchemaVersionsVarargs(value: SchemaVersionSummary*): Self = StObject.set(x, "SchemaVersions", js.Array(value*))
  }
}
