package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UplinkEchoConfig extends StObject {
  
  /**
    * ARN of an uplink Config.
    */
  var antennaUplinkConfigArn: ConfigArn
  
  /**
    * Whether or not an uplink Config is enabled.
    */
  var enabled: Boolean
}
object UplinkEchoConfig {
  
  inline def apply(antennaUplinkConfigArn: ConfigArn, enabled: Boolean): UplinkEchoConfig = {
    val __obj = js.Dynamic.literal(antennaUplinkConfigArn = antennaUplinkConfigArn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UplinkEchoConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UplinkEchoConfig] (val x: Self) extends AnyVal {
    
    inline def setAntennaUplinkConfigArn(value: ConfigArn): Self = StObject.set(x, "antennaUplinkConfigArn", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
