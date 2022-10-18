package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypedLinkFacetAttributesRequest extends StObject {
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object ListTypedLinkFacetAttributesRequest {
  
  inline def apply(Name: TypedLinkName, SchemaArn: Arn): ListTypedLinkFacetAttributesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypedLinkFacetAttributesRequest]
  }
  
  extension [Self <: ListTypedLinkFacetAttributesRequest](x: Self) {
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: TypedLinkName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
