package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetI[I] extends StObject {
  
  var target: I
}
object TargetI {
  
  inline def apply[I](target: I): TargetI[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetI[I]]
  }
  
  extension [Self <: TargetI[?], I](x: Self & TargetI[I]) {
    
    inline def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
