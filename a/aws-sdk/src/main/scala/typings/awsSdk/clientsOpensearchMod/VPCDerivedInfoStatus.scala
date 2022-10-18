package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCDerivedInfoStatus extends StObject {
  
  /**
    * The VPC options for the specified domain.
    */
  var Options: VPCDerivedInfo
  
  /**
    * The status of the VPC options for the specified domain.
    */
  var Status: OptionStatus
}
object VPCDerivedInfoStatus {
  
  inline def apply(Options: VPCDerivedInfo, Status: OptionStatus): VPCDerivedInfoStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCDerivedInfoStatus]
  }
  
  extension [Self <: VPCDerivedInfoStatus](x: Self) {
    
    inline def setOptions(value: VPCDerivedInfo): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
