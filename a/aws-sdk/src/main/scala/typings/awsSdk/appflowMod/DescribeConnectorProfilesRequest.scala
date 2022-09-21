package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorProfilesRequest extends StObject {
  
  /**
    * The name of the connector. The name is unique for each ConnectorRegistration in your Amazon Web Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the Amazon Web Services account. 
    */
  var connectorProfileNames: js.UndefOr[ConnectorProfileNameList] = js.undefined
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
  
  /**
    *  Specifies the maximum number of items that should be returned in the result set. The default for maxResults is 20 (for all paginated API operations). 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeConnectorProfilesRequest {
  
  inline def apply(): DescribeConnectorProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorProfilesRequest]
  }
  
  extension [Self <: DescribeConnectorProfilesRequest](x: Self) {
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorProfileNames(value: ConnectorProfileNameList): Self = StObject.set(x, "connectorProfileNames", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNamesUndefined: Self = StObject.set(x, "connectorProfileNames", js.undefined)
    
    inline def setConnectorProfileNamesVarargs(value: ConnectorProfileName*): Self = StObject.set(x, "connectorProfileNames", js.Array(value*))
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
