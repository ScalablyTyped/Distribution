package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueryDefinitionsRequest extends StObject {
  
  /**
    * Limits the number of returned query definitions to the specified number.
    */
  var maxResults: js.UndefOr[QueryListMaxResults] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Use this parameter to filter your results to only the query definitions that have names that start with the prefix you specify.
    */
  var queryDefinitionNamePrefix: js.UndefOr[QueryDefinitionName] = js.undefined
}
object DescribeQueryDefinitionsRequest {
  
  inline def apply(): DescribeQueryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryDefinitionsRequest]
  }
  
  extension [Self <: DescribeQueryDefinitionsRequest](x: Self) {
    
    inline def setMaxResults(value: QueryListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setQueryDefinitionNamePrefix(value: QueryDefinitionName): Self = StObject.set(x, "queryDefinitionNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setQueryDefinitionNamePrefixUndefined: Self = StObject.set(x, "queryDefinitionNamePrefix", js.undefined)
  }
}
