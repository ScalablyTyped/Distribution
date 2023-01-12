package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedOptionsStatus extends StObject {
  
  /**
    * The status of advanced options for the specified domain.
    */
  var Options: AdvancedOptions
  
  /**
    * The status of advanced options for the specified domain.
    */
  var Status: OptionStatus
}
object AdvancedOptionsStatus {
  
  inline def apply(Options: AdvancedOptions, Status: OptionStatus): AdvancedOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedOptionsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedOptionsStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: AdvancedOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
