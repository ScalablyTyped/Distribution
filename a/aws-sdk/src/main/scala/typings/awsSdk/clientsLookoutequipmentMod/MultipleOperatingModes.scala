package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleOperatingModes extends StObject {
  
  /**
    *  Indicates whether there is a potential data issue related to having multiple operating modes. 
    */
  var Status: StatisticalIssueStatus
}
object MultipleOperatingModes {
  
  inline def apply(Status: StatisticalIssueStatus): MultipleOperatingModes = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOperatingModes]
  }
  
  extension [Self <: MultipleOperatingModes](x: Self) {
    
    inline def setStatus(value: StatisticalIssueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
