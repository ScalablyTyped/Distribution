package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorsRequest extends StObject {
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorTypes: js.UndefOr[ConnectorTypeList] = js.undefined
  
  /**
    * The maximum number of items that should be returned in the result set. The default is 20.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeConnectorsRequest {
  
  inline def apply(): DescribeConnectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorsRequest]
  }
  
  extension [Self <: DescribeConnectorsRequest](x: Self) {
    
    inline def setConnectorTypes(value: ConnectorTypeList): Self = StObject.set(x, "connectorTypes", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypesUndefined: Self = StObject.set(x, "connectorTypes", js.undefined)
    
    inline def setConnectorTypesVarargs(value: ConnectorType*): Self = StObject.set(x, "connectorTypes", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
