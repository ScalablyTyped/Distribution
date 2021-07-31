package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseValue extends StObject {
  
  var useValue: js.Any
}
object UseValue {
  
  @scala.inline
  def apply(useValue: js.Any): UseValue = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseValue]
  }
  
  @scala.inline
  implicit class UseValueMutableBuilder[Self <: UseValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
  }
}
