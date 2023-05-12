package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectivityIam extends StObject {
  
  /**
    * 
    SASL/IAM authentication is on or off for VPC connectivity.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object VpcConnectivityIam {
  
  inline def apply(): VpcConnectivityIam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnectivityIam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectivityIam] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
