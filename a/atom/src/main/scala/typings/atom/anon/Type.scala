package typings.atom.anon

import typings.atom.atomStrings.separator
import typings.atom.mod.ContextMenuOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with ContextMenuOptions {
  
  var `type`: separator
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("separator")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
