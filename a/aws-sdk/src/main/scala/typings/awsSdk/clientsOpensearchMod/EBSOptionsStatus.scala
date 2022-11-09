package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSOptionsStatus extends StObject {
  
  /**
    * The configured EBS options for the specified domain.
    */
  var Options: EBSOptions
  
  /**
    * The status of the EBS options for the specified domain.
    */
  var Status: OptionStatus
}
object EBSOptionsStatus {
  
  inline def apply(Options: EBSOptions, Status: OptionStatus): EBSOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBSOptionsStatus]
  }
  
  extension [Self <: EBSOptionsStatus](x: Self) {
    
    inline def setOptions(value: EBSOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
