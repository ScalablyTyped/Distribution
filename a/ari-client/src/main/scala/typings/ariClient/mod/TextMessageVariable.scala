package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMessageVariable extends StObject {
  
  var key: String
  
  var value: String
}
object TextMessageVariable {
  
  @scala.inline
  def apply(key: String, value: String): TextMessageVariable = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessageVariable]
  }
  
  @scala.inline
  implicit class TextMessageVariableMutableBuilder[Self <: TextMessageVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
