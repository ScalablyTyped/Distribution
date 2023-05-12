package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasInput extends StObject {
  
  /**
    * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
    */
  var collaborationIdentifier: CollaborationIdentifier
  
  /**
    * The maximum size of the results that is returned per call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
    */
  var schemaType: js.UndefOr[SchemaType] = js.undefined
}
object ListSchemasInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier): ListSchemasInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSchemasInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSchemaType(value: SchemaType): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    inline def setSchemaTypeUndefined: Self = StObject.set(x, "schemaType", js.undefined)
  }
}
