package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
  
  /**
    * The ID of the function definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListFunctionDefinitionVersions'' requests. If the version is the last one that was associated with a function definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var FunctionDefinitionVersionId: string
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object GetFunctionDefinitionVersionRequest {
  
  inline def apply(FunctionDefinitionId: string, FunctionDefinitionVersionId: string): GetFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any], FunctionDefinitionVersionId = FunctionDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDefinitionVersionRequest]
  }
  
  extension [Self <: GetFunctionDefinitionVersionRequest](x: Self) {
    
    inline def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setFunctionDefinitionVersionId(value: string): Self = StObject.set(x, "FunctionDefinitionVersionId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
