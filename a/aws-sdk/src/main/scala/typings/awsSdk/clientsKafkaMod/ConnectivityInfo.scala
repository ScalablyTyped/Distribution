package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectivityInfo extends StObject {
  
  /**
    * 
    Public access control for brokers.
    
    */
  var PublicAccess: js.UndefOr[typings.awsSdk.clientsKafkaMod.PublicAccess] = js.undefined
  
  /**
    * 
    VPC connectivity access control for brokers.
    
    */
  var VpcConnectivity: js.UndefOr[typings.awsSdk.clientsKafkaMod.VpcConnectivity] = js.undefined
}
object ConnectivityInfo {
  
  inline def apply(): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectivityInfo] (val x: Self) extends AnyVal {
    
    inline def setPublicAccess(value: PublicAccess): Self = StObject.set(x, "PublicAccess", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessUndefined: Self = StObject.set(x, "PublicAccess", js.undefined)
    
    inline def setVpcConnectivity(value: VpcConnectivity): Self = StObject.set(x, "VpcConnectivity", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectivityUndefined: Self = StObject.set(x, "VpcConnectivity", js.undefined)
  }
}
