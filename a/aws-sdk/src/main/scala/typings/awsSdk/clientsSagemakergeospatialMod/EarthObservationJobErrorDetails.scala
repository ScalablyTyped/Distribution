package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EarthObservationJobErrorDetails extends StObject {
  
  /**
    * A detailed message describing the error in an Earth Observation job.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The type of error in an Earth Observation job.
    */
  var Type: js.UndefOr[EarthObservationJobErrorType] = js.undefined
}
object EarthObservationJobErrorDetails {
  
  inline def apply(): EarthObservationJobErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EarthObservationJobErrorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EarthObservationJobErrorDetails] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: EarthObservationJobErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
