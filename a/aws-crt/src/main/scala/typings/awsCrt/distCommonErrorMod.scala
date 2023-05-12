package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonErrorMod {
  
  trait ICrtError extends StObject {
    
    val error_name: js.UndefOr[String] = js.undefined
  }
  object ICrtError {
    
    inline def apply(): ICrtError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICrtError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICrtError] (val x: Self) extends AnyVal {
      
      inline def setError_name(value: String): Self = StObject.set(x, "error_name", value.asInstanceOf[js.Any])
      
      inline def setError_nameUndefined: Self = StObject.set(x, "error_name", js.undefined)
    }
  }
}
