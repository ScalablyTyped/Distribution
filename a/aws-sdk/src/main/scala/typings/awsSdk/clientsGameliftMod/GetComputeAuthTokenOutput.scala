package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComputeAuthTokenOutput extends StObject {
  
  /**
    * The authentication token that your game server uses to authenticate with Amazon GameLift.
    */
  var AuthToken: js.UndefOr[ComputeAuthToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912 
    */
  var ComputeArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.ComputeArn] = js.undefined
  
  /**
    * The name of the compute resource you are requesting the authentication token for.
    */
  var ComputeName: js.UndefOr[ComputeNameOrArn] = js.undefined
  
  /**
    * The amount of time until the authentication token is no longer valid. To continue using the compute resource for game server hosting, renew the authentication token by using this operation again.
    */
  var ExpirationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet that the compute is registered to.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.undefined
}
object GetComputeAuthTokenOutput {
  
  inline def apply(): GetComputeAuthTokenOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComputeAuthTokenOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComputeAuthTokenOutput] (val x: Self) extends AnyVal {
    
    inline def setAuthToken(value: ComputeAuthToken): Self = StObject.set(x, "AuthToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "AuthToken", js.undefined)
    
    inline def setComputeArn(value: ComputeArn): Self = StObject.set(x, "ComputeArn", value.asInstanceOf[js.Any])
    
    inline def setComputeArnUndefined: Self = StObject.set(x, "ComputeArn", js.undefined)
    
    inline def setComputeName(value: ComputeNameOrArn): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setComputeNameUndefined: Self = StObject.set(x, "ComputeName", js.undefined)
    
    inline def setExpirationTimestamp(value: js.Date): Self = StObject.set(x, "ExpirationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimestampUndefined: Self = StObject.set(x, "ExpirationTimestamp", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
