package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticIpStatus extends StObject {
  
  /**
    * The elastic IP (EIP) address for the cluster.
    */
  var ElasticIp: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the elastic IP (EIP) address.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ElasticIpStatus {
  
  inline def apply(): ElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticIpStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticIpStatus] (val x: Self) extends AnyVal {
    
    inline def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    inline def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
