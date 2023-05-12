package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSInspectionConfiguration extends StObject {
  
  /**
    * Lists the server certificate configurations that are associated with the TLS configuration.
    */
  var ServerCertificateConfigurations: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.ServerCertificateConfigurations] = js.undefined
}
object TLSInspectionConfiguration {
  
  inline def apply(): TLSInspectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSInspectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TLSInspectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setServerCertificateConfigurations(value: ServerCertificateConfigurations): Self = StObject.set(x, "ServerCertificateConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateConfigurationsUndefined: Self = StObject.set(x, "ServerCertificateConfigurations", js.undefined)
    
    inline def setServerCertificateConfigurationsVarargs(value: ServerCertificateConfiguration*): Self = StObject.set(x, "ServerCertificateConfigurations", js.Array(value*))
  }
}
