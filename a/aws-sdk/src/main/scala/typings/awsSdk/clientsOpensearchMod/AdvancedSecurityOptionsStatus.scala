package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSecurityOptionsStatus extends StObject {
  
  /**
    * Container for fine-grained access control settings.
    */
  var Options: AdvancedSecurityOptions
  
  /**
    * Status of the fine-grained access control settings for a domain.
    */
  var Status: OptionStatus
}
object AdvancedSecurityOptionsStatus {
  
  inline def apply(Options: AdvancedSecurityOptions, Status: OptionStatus): AdvancedSecurityOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSecurityOptionsStatus]
  }
  
  extension [Self <: AdvancedSecurityOptionsStatus](x: Self) {
    
    inline def setOptions(value: AdvancedSecurityOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
