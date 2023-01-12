package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInfo extends StObject {
  
  /**
    * The ID of the KMS key used to encrypt the data in this Amazon Web Services Region.
    */
  var sseKmsKeyId: js.UndefOr[SseKmsKey] = js.undefined
  
  /**
    * The status of the Amazon Web Services Region in the replication set.
    */
  var status: RegionStatus
  
  /**
    * Information displayed about the status of the Amazon Web Services Region.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The most recent date and time that Incident Manager updated the Amazon Web Services Region's status.
    */
  var statusUpdateDateTime: js.Date
}
object RegionInfo {
  
  inline def apply(status: RegionStatus, statusUpdateDateTime: js.Date): RegionInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusUpdateDateTime = statusUpdateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionInfo] (val x: Self) extends AnyVal {
    
    inline def setSseKmsKeyId(value: SseKmsKey): Self = StObject.set(x, "sseKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSseKmsKeyIdUndefined: Self = StObject.set(x, "sseKmsKeyId", js.undefined)
    
    inline def setStatus(value: RegionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUpdateDateTime(value: js.Date): Self = StObject.set(x, "statusUpdateDateTime", value.asInstanceOf[js.Any])
  }
}
