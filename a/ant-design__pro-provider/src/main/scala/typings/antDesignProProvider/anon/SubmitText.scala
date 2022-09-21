package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitText extends StObject {
  
  var submitText: String
}
object SubmitText {
  
  inline def apply(submitText: String): SubmitText = {
    val __obj = js.Dynamic.literal(submitText = submitText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitText]
  }
  
  extension [Self <: SubmitText](x: Self) {
    
    inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
  }
}
