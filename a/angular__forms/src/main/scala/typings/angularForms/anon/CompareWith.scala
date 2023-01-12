package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.compareWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareWith extends StObject {
  
  var compareWith: typings.angularForms.angularFormsStrings.compareWith
}
object CompareWith {
  
  inline def apply(): CompareWith = {
    val __obj = js.Dynamic.literal(compareWith = "compareWith")
    __obj.asInstanceOf[CompareWith]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompareWith] (val x: Self) extends AnyVal {
    
    inline def setCompareWith(value: compareWith): Self = StObject.set(x, "compareWith", value.asInstanceOf[js.Any])
  }
}
