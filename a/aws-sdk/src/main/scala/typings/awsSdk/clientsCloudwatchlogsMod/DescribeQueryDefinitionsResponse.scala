package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueryDefinitionsResponse extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of query definitions that match your request.
    */
  var queryDefinitions: js.UndefOr[QueryDefinitionList] = js.undefined
}
object DescribeQueryDefinitionsResponse {
  
  inline def apply(): DescribeQueryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQueryDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setQueryDefinitions(value: QueryDefinitionList): Self = StObject.set(x, "queryDefinitions", value.asInstanceOf[js.Any])
    
    inline def setQueryDefinitionsUndefined: Self = StObject.set(x, "queryDefinitions", js.undefined)
    
    inline def setQueryDefinitionsVarargs(value: QueryDefinition*): Self = StObject.set(x, "queryDefinitions", js.Array(value*))
  }
}
