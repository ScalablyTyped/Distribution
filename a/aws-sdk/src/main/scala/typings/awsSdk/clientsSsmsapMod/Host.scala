package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  /**
    * The IP address of the Dedicated Host. 
    */
  var HostIp: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Dedicated Host.
    */
  var HostName: js.UndefOr[String] = js.undefined
  
  /**
    * The role of the Dedicated Host.
    */
  var HostRole: js.UndefOr[typings.awsSdk.clientsSsmsapMod.HostRole] = js.undefined
  
  /**
    * The instance ID of the instance on the Dedicated Host.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object Host {
  
  inline def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    inline def setHostIp(value: String): Self = StObject.set(x, "HostIp", value.asInstanceOf[js.Any])
    
    inline def setHostIpUndefined: Self = StObject.set(x, "HostIp", js.undefined)
    
    inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
    
    inline def setHostRole(value: HostRole): Self = StObject.set(x, "HostRole", value.asInstanceOf[js.Any])
    
    inline def setHostRoleUndefined: Self = StObject.set(x, "HostRole", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
