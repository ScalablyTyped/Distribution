package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationSummary extends StObject {
  
  /**
    * Identifier returned to track the requested action.
    */
  var OperationId: typings.awsSdk.clientsRoute53domainsMod.OperationId
  
  /**
    * The current status of the requested operation in the system.
    */
  var Status: OperationStatus
  
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.Date
  
  /**
    * Type of the action requested.
    */
  var Type: OperationType
}
object OperationSummary {
  
  inline def apply(OperationId: OperationId, Status: OperationStatus, SubmittedDate: js.Date, Type: OperationType): OperationSummary = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubmittedDate = SubmittedDate.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationSummary] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDate(value: js.Date): Self = StObject.set(x, "SubmittedDate", value.asInstanceOf[js.Any])
    
    inline def setType(value: OperationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
