package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerEngineTypesResponse extends StObject {
  
  /**
    * List of available engine types and versions.
    */
  var BrokerEngineTypes: js.UndefOr[listOfBrokerEngineType] = js.undefined
  
  /**
    * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integerMin5Max100] = js.undefined
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object DescribeBrokerEngineTypesResponse {
  
  inline def apply(): DescribeBrokerEngineTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerEngineTypesResponse]
  }
  
  extension [Self <: DescribeBrokerEngineTypesResponse](x: Self) {
    
    inline def setBrokerEngineTypes(value: listOfBrokerEngineType): Self = StObject.set(x, "BrokerEngineTypes", value.asInstanceOf[js.Any])
    
    inline def setBrokerEngineTypesUndefined: Self = StObject.set(x, "BrokerEngineTypes", js.undefined)
    
    inline def setBrokerEngineTypesVarargs(value: BrokerEngineType*): Self = StObject.set(x, "BrokerEngineTypes", js.Array(value*))
    
    inline def setMaxResults(value: integerMin5Max100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
