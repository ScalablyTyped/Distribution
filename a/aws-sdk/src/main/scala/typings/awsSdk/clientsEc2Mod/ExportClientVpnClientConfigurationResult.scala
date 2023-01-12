package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportClientVpnClientConfigurationResult extends StObject {
  
  /**
    * The contents of the Client VPN endpoint configuration file.
    */
  var ClientConfiguration: js.UndefOr[String] = js.undefined
}
object ExportClientVpnClientConfigurationResult {
  
  inline def apply(): ExportClientVpnClientConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportClientVpnClientConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setClientConfiguration(value: String): Self = StObject.set(x, "ClientConfiguration", value.asInstanceOf[js.Any])
    
    inline def setClientConfigurationUndefined: Self = StObject.set(x, "ClientConfiguration", js.undefined)
  }
}
