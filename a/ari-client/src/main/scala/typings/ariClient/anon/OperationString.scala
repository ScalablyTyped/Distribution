package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationString extends StObject {
  
  var operation: String
}
object OperationString {
  
  @scala.inline
  def apply(operation: String): OperationString = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationString]
  }
  
  @scala.inline
  implicit class OperationStringMutableBuilder[Self <: OperationString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
