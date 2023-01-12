package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigExportDeliveryInfo extends StObject {
  
  /**
    * The time of the last attempted delivery.
    */
  var lastAttemptTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the last attempted delivery.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.undefined
  
  /**
    * The time of the last successful delivery.
    */
  var lastSuccessfulTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the next delivery occurs.
    */
  var nextDeliveryTime: js.UndefOr[js.Date] = js.undefined
}
object ConfigExportDeliveryInfo {
  
  inline def apply(): ConfigExportDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigExportDeliveryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigExportDeliveryInfo] (val x: Self) extends AnyVal {
    
    inline def setLastAttemptTime(value: js.Date): Self = StObject.set(x, "lastAttemptTime", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptTimeUndefined: Self = StObject.set(x, "lastAttemptTime", js.undefined)
    
    inline def setLastErrorCode(value: String): Self = StObject.set(x, "lastErrorCode", value.asInstanceOf[js.Any])
    
    inline def setLastErrorCodeUndefined: Self = StObject.set(x, "lastErrorCode", js.undefined)
    
    inline def setLastErrorMessage(value: String): Self = StObject.set(x, "lastErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setLastErrorMessageUndefined: Self = StObject.set(x, "lastErrorMessage", js.undefined)
    
    inline def setLastStatus(value: DeliveryStatus): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    inline def setLastSuccessfulTime(value: js.Date): Self = StObject.set(x, "lastSuccessfulTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulTimeUndefined: Self = StObject.set(x, "lastSuccessfulTime", js.undefined)
    
    inline def setNextDeliveryTime(value: js.Date): Self = StObject.set(x, "nextDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setNextDeliveryTimeUndefined: Self = StObject.set(x, "nextDeliveryTime", js.undefined)
  }
}
