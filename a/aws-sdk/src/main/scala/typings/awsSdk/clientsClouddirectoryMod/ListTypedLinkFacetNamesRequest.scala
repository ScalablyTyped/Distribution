package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypedLinkFacetNamesRequest extends StObject {
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object ListTypedLinkFacetNamesRequest {
  
  inline def apply(SchemaArn: Arn): ListTypedLinkFacetNamesRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypedLinkFacetNamesRequest]
  }
  
  extension [Self <: ListTypedLinkFacetNamesRequest](x: Self) {
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
