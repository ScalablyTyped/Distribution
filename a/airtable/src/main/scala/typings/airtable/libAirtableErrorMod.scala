package typings.airtable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAirtableErrorMod {
  
  @JSImport("airtable/lib/airtable_error", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AirtableError {
    def this(error: String, message: String, statusCode: Double) = this()
    
    /* CompleteClass */
    var error: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  trait AirtableError extends StObject {
    
    var error: String
    
    var message: String
    
    var statusCode: Double
  }
  object AirtableError {
    
    inline def apply(error: String, message: String, statusCode: Double): AirtableError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AirtableError]
    }
    
    extension [Self <: AirtableError](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
