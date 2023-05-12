package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportErrorDetailsOutput extends StObject {
  
  /**
    * A detailed message describing the error in an export EarthObservationJob operation.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The type of error in an export EarthObservationJob operation.
    */
  var Type: js.UndefOr[ExportErrorType] = js.undefined
}
object ExportErrorDetailsOutput {
  
  inline def apply(): ExportErrorDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportErrorDetailsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportErrorDetailsOutput] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: ExportErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
