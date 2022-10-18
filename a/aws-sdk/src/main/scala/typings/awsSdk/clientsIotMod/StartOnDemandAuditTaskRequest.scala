package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOnDemandAuditTaskRequest extends StObject {
  
  /**
    * Which checks are performed during the audit. The checks you specify must be enabled for your account or an exception occurs. Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.
    */
  var targetCheckNames: TargetAuditCheckNames
}
object StartOnDemandAuditTaskRequest {
  
  inline def apply(targetCheckNames: TargetAuditCheckNames): StartOnDemandAuditTaskRequest = {
    val __obj = js.Dynamic.literal(targetCheckNames = targetCheckNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandAuditTaskRequest]
  }
  
  extension [Self <: StartOnDemandAuditTaskRequest](x: Self) {
    
    inline def setTargetCheckNames(value: TargetAuditCheckNames): Self = StObject.set(x, "targetCheckNames", value.asInstanceOf[js.Any])
    
    inline def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = StObject.set(x, "targetCheckNames", js.Array(value*))
  }
}
