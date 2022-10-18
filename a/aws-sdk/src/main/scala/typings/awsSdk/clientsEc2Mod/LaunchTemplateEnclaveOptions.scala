package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateEnclaveOptions extends StObject {
  
  /**
    * If this parameter is set to true, the instance is enabled for Amazon Web Services Nitro Enclaves; otherwise, it is not enabled for Amazon Web Services Nitro Enclaves.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object LaunchTemplateEnclaveOptions {
  
  inline def apply(): LaunchTemplateEnclaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateEnclaveOptions]
  }
  
  extension [Self <: LaunchTemplateEnclaveOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
