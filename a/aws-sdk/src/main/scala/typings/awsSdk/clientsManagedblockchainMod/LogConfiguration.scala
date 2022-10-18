package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfiguration extends StObject {
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Enabled] = js.undefined
}
object LogConfiguration {
  
  inline def apply(): LogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfiguration]
  }
  
  extension [Self <: LogConfiguration](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
