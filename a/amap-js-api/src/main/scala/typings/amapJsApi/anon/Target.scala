package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target[I] extends StObject {
  
  var target: I = js.native
}
object Target {
  
  @scala.inline
  def apply[I](target: I): Target[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[I]]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target[_], I] (val x: Self with Target[I]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
