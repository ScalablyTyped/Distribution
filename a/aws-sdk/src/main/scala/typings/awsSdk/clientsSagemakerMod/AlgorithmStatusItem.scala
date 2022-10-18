package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmStatusItem extends StObject {
  
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the algorithm for which the overall status is being reported.
    */
  var Name: EntityName
  
  /**
    * The current status.
    */
  var Status: DetailedAlgorithmStatus
}
object AlgorithmStatusItem {
  
  inline def apply(Name: EntityName, Status: DetailedAlgorithmStatus): AlgorithmStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmStatusItem]
  }
  
  extension [Self <: AlgorithmStatusItem](x: Self) {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DetailedAlgorithmStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
