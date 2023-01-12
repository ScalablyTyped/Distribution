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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmitText] (val x: Self) extends AnyVal {
    
    inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
  }
}
