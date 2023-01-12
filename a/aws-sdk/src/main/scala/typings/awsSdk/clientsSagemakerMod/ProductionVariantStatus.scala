package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionVariantStatus extends StObject {
  
  /**
    * The start time of the current status change.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The endpoint variant status which describes the current deployment stage status or operational status.    Creating: Creating inference resources for the production variant.    Deleting: Terminating inference resources for the production variant.    Updating: Updating capacity for the production variant.    ActivatingTraffic: Turning on traffic for the production variant.    Baking: Waiting period to monitor the CloudWatch alarms in the automatic rollback configuration.  
    */
  var Status: VariantStatus
  
  /**
    * A message that describes the status of the production variant.
    */
  var StatusMessage: js.UndefOr[VariantStatusMessage] = js.undefined
}
object ProductionVariantStatus {
  
  inline def apply(Status: VariantStatus): ProductionVariantStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductionVariantStatus] (val x: Self) extends AnyVal {
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: VariantStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: VariantStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
