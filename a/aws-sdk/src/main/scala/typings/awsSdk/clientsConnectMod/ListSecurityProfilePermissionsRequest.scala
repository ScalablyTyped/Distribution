package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityProfilePermissionsRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The identifier for the security profle.
    */
  var SecurityProfileId: typings.awsSdk.clientsConnectMod.SecurityProfileId
}
object ListSecurityProfilePermissionsRequest {
  
  inline def apply(InstanceId: InstanceId, SecurityProfileId: SecurityProfileId): ListSecurityProfilePermissionsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileId = SecurityProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityProfilePermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityProfilePermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityProfileId(value: SecurityProfileId): Self = StObject.set(x, "SecurityProfileId", value.asInstanceOf[js.Any])
  }
}
