package typings.astring.anon

import typings.astring.astringStrings.ClassExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: ClassExpression
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
