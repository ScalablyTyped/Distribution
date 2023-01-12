package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageStatusItem extends StObject {
  
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the model package for which the overall status is being reported.
    */
  var Name: EntityName
  
  /**
    * The current status.
    */
  var Status: DetailedModelPackageStatus
}
object ModelPackageStatusItem {
  
  inline def apply(Name: EntityName, Status: DetailedModelPackageStatus): ModelPackageStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelPackageStatusItem] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DetailedModelPackageStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
