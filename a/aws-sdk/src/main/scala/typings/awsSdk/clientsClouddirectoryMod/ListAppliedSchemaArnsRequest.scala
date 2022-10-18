package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppliedSchemaArnsRequest extends StObject {
  
  /**
    * The ARN of the directory you are listing.
    */
  var DirectoryArn: Arn
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * The response for ListAppliedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}
object ListAppliedSchemaArnsRequest {
  
  inline def apply(DirectoryArn: Arn): ListAppliedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppliedSchemaArnsRequest]
  }
  
  extension [Self <: ListAppliedSchemaArnsRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
