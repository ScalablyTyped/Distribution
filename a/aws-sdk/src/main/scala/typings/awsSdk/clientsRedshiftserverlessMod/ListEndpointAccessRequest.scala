package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointAccessRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var maxResults: js.UndefOr[ListEndpointAccessRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListEndpointAccess operation returns a nextToken, you can include the returned nextToken in subsequent ListEndpointAccess operations, which returns results in the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
    */
  var vpcId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the workgroup associated with the VPC endpoint to return.
    */
  var workgroupName: js.UndefOr[String] = js.undefined
}
object ListEndpointAccessRequest {
  
  inline def apply(): ListEndpointAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointAccessRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEndpointAccessRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListEndpointAccessRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    
    inline def setWorkgroupName(value: String): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
