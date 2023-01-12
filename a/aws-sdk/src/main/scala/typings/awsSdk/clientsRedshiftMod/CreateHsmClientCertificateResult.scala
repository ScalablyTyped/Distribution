package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmClientCertificateResult extends StObject {
  
  var HsmClientCertificate: js.UndefOr[typings.awsSdk.clientsRedshiftMod.HsmClientCertificate] = js.undefined
}
object CreateHsmClientCertificateResult {
  
  inline def apply(): CreateHsmClientCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmClientCertificateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHsmClientCertificateResult] (val x: Self) extends AnyVal {
    
    inline def setHsmClientCertificate(value: HsmClientCertificate): Self = StObject.set(x, "HsmClientCertificate", value.asInstanceOf[js.Any])
    
    inline def setHsmClientCertificateUndefined: Self = StObject.set(x, "HsmClientCertificate", js.undefined)
  }
}
