package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComputeAccessOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var ComputeArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.ComputeArn] = js.undefined
  
  /**
    * The name of the compute resource you requested credentials for.
    */
  var ComputeName: js.UndefOr[ComputeNameOrArn] = js.undefined
  
  /**
    * The access credentials for the compute resource.
    */
  var Credentials: js.UndefOr[AwsCredentials] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * The fleet ID of compute resource.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.undefined
}
object GetComputeAccessOutput {
  
  inline def apply(): GetComputeAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComputeAccessOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComputeAccessOutput] (val x: Self) extends AnyVal {
    
    inline def setComputeArn(value: ComputeArn): Self = StObject.set(x, "ComputeArn", value.asInstanceOf[js.Any])
    
    inline def setComputeArnUndefined: Self = StObject.set(x, "ComputeArn", js.undefined)
    
    inline def setComputeName(value: ComputeNameOrArn): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setComputeNameUndefined: Self = StObject.set(x, "ComputeName", js.undefined)
    
    inline def setCredentials(value: AwsCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
