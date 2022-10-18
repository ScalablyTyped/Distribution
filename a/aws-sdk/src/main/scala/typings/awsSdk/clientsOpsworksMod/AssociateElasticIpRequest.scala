package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateElasticIpRequest extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object AssociateElasticIpRequest {
  
  inline def apply(ElasticIp: String): AssociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateElasticIpRequest]
  }
  
  extension [Self <: AssociateElasticIpRequest](x: Self) {
    
    inline def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
