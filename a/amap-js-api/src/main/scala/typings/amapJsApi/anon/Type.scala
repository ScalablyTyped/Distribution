package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[N /* <: String */] extends StObject {
  
  var `type`: N
}
object Type {
  
  @scala.inline
  def apply[N /* <: String */](`type`: N): Type[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[N]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[?], N /* <: String */] (val x: Self & Type[N]) extends AnyVal {
    
    @scala.inline
    def setType(value: N): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
