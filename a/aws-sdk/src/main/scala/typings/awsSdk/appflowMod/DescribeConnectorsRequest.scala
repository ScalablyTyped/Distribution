package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorsRequest extends StObject {
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorTypes: js.UndefOr[ConnectorTypeList] = js.native
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeConnectorsRequest {
  
  @scala.inline
  def apply(): DescribeConnectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorsRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectorsRequestMutableBuilder[Self <: DescribeConnectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorTypes(value: ConnectorTypeList): Self = StObject.set(x, "connectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorTypesUndefined: Self = StObject.set(x, "connectorTypes", js.undefined)
    
    @scala.inline
    def setConnectorTypesVarargs(value: ConnectorType*): Self = StObject.set(x, "connectorTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
