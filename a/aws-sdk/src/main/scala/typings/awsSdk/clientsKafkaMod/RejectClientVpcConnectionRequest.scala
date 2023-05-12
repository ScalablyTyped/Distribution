package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectClientVpcConnectionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The VPC connection ARN.
    
    */
  var VpcConnectionArn: string
}
object RejectClientVpcConnectionRequest {
  
  inline def apply(VpcConnectionArn: string): RejectClientVpcConnectionRequest = {
    val __obj = js.Dynamic.literal(VpcConnectionArn = VpcConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectClientVpcConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectClientVpcConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setVpcConnectionArn(value: string): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
  }
}
