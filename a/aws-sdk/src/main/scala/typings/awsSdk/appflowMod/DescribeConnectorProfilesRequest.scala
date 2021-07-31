package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorProfilesRequest extends StObject {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account. 
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
  
  @scala.inline
  def apply(): DescribeConnectorProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorProfilesRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectorProfilesRequestMutableBuilder[Self <: DescribeConnectorProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileNames(value: ConnectorProfileNameList): Self = StObject.set(x, "connectorProfileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileNamesUndefined: Self = StObject.set(x, "connectorProfileNames", js.undefined)
    
    @scala.inline
    def setConnectorProfileNamesVarargs(value: ConnectorProfileName*): Self = StObject.set(x, "connectorProfileNames", js.Array(value :_*))
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
