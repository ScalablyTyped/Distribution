package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectivitySasl extends StObject {
  
  /**
    * 
    Details for SASL/IAM client authentication for VPC connectivity.
    
    */
  var Iam: js.UndefOr[VpcConnectivityIam] = js.undefined
  
  /**
    * 
    Details for SASL/SCRAM client authentication for VPC connectivity.
    
    */
  var Scram: js.UndefOr[VpcConnectivityScram] = js.undefined
}
object VpcConnectivitySasl {
  
  inline def apply(): VpcConnectivitySasl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnectivitySasl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectivitySasl] (val x: Self) extends AnyVal {
    
    inline def setIam(value: VpcConnectivityIam): Self = StObject.set(x, "Iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "Iam", js.undefined)
    
    inline def setScram(value: VpcConnectivityScram): Self = StObject.set(x, "Scram", value.asInstanceOf[js.Any])
    
    inline def setScramUndefined: Self = StObject.set(x, "Scram", js.undefined)
  }
}
