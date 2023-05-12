package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRunProgressStatus extends StObject {
  
  /**
    * The timestamp when the dry run was initiated.
    */
  var CreationDate: String
  
  /**
    * The unique identifier of the dry run.
    */
  var DryRunId: GUID
  
  /**
    * The current status of the dry run.
    */
  var DryRunStatus: String
  
  /**
    * The timestamp when the dry run was last updated.
    */
  var UpdateDate: String
  
  /**
    * Any validation failures that occurred as a result of the dry run.
    */
  var ValidationFailures: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ValidationFailures] = js.undefined
}
object DryRunProgressStatus {
  
  inline def apply(CreationDate: String, DryRunId: GUID, DryRunStatus: String, UpdateDate: String): DryRunProgressStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DryRunId = DryRunId.asInstanceOf[js.Any], DryRunStatus = DryRunStatus.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryRunProgressStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DryRunProgressStatus] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setDryRunId(value: GUID): Self = StObject.set(x, "DryRunId", value.asInstanceOf[js.Any])
    
    inline def setDryRunStatus(value: String): Self = StObject.set(x, "DryRunStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateDate(value: String): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setValidationFailures(value: ValidationFailures): Self = StObject.set(x, "ValidationFailures", value.asInstanceOf[js.Any])
    
    inline def setValidationFailuresUndefined: Self = StObject.set(x, "ValidationFailures", js.undefined)
    
    inline def setValidationFailuresVarargs(value: ValidationFailure*): Self = StObject.set(x, "ValidationFailures", js.Array(value*))
  }
}
