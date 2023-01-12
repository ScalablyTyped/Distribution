package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProjectEventsResultEntry extends StObject {
  
  /**
    * If the PutProjectEvents operation has an error, the error code is returned here.
    */
  var errorCode: js.UndefOr[ErrorCodeEnum] = js.undefined
  
  /**
    * If the PutProjectEvents operation has an error, the error message is returned here.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * A unique ID assigned to this PutProjectEvents operation. 
    */
  var eventId: js.UndefOr[Uuid] = js.undefined
}
object PutProjectEventsResultEntry {
  
  inline def apply(): PutProjectEventsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutProjectEventsResultEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutProjectEventsResultEntry] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCodeEnum): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setEventId(value: Uuid): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
  }
}
