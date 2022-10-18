package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSerialConsoleAccessStatusResult extends StObject {
  
  /**
    * If true, access to the EC2 serial console of all instances is enabled for your account. If false, access to the EC2 serial console of all instances is disabled for your account.
    */
  var SerialConsoleAccessEnabled: js.UndefOr[Boolean] = js.undefined
}
object GetSerialConsoleAccessStatusResult {
  
  inline def apply(): GetSerialConsoleAccessStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSerialConsoleAccessStatusResult]
  }
  
  extension [Self <: GetSerialConsoleAccessStatusResult](x: Self) {
    
    inline def setSerialConsoleAccessEnabled(value: Boolean): Self = StObject.set(x, "SerialConsoleAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setSerialConsoleAccessEnabledUndefined: Self = StObject.set(x, "SerialConsoleAccessEnabled", js.undefined)
  }
}
