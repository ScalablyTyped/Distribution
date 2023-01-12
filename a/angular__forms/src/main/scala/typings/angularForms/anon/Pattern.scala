package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  var pattern: typings.angularForms.angularFormsStrings.pattern
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal(pattern = "pattern")
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
