package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnclaveOptions extends StObject {
  
  /**
    * If this parameter is set to true, the instance is enabled for Amazon Web Services Nitro Enclaves; otherwise, it is not enabled for Amazon Web Services Nitro Enclaves.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object EnclaveOptions {
  
  inline def apply(): EnclaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnclaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnclaveOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
