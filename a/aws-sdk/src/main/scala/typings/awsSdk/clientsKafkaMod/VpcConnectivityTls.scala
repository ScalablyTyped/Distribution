package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectivityTls extends StObject {
  
  /**
    * 
    TLS authentication is on or off for VPC connectivity.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object VpcConnectivityTls {
  
  inline def apply(): VpcConnectivityTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnectivityTls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectivityTls] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
