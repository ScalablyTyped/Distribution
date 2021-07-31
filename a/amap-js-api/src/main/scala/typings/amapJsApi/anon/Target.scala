package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target[I] extends StObject {
  
  var target: I
}
object Target {
  
  @scala.inline
  def apply[I](target: I): Target[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[I]]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target[?], I] (val x: Self & Target[I]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
