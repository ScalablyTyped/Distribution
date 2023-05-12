package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateInstanceRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance. You can provide the InstanceId, or the entire ARN.
    */
  var InstanceId: InstanceIdOrArn
  
  /**
    * The alias for the replicated instance. The ReplicaAlias must be unique.
    */
  var ReplicaAlias: DirectoryAlias
  
  /**
    * The Amazon Web Services Region where to replicate the Amazon Connect instance.
    */
  var ReplicaRegion: AwsRegion
}
object ReplicateInstanceRequest {
  
  inline def apply(InstanceId: InstanceIdOrArn, ReplicaAlias: DirectoryAlias, ReplicaRegion: AwsRegion): ReplicateInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ReplicaAlias = ReplicaAlias.asInstanceOf[js.Any], ReplicaRegion = ReplicaRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicateInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicateInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInstanceId(value: InstanceIdOrArn): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setReplicaAlias(value: DirectoryAlias): Self = StObject.set(x, "ReplicaAlias", value.asInstanceOf[js.Any])
    
    inline def setReplicaRegion(value: AwsRegion): Self = StObject.set(x, "ReplicaRegion", value.asInstanceOf[js.Any])
  }
}
