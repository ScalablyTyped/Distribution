package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reloaded extends StObject {
  
  var reloaded: Boolean
}
object Reloaded {
  
  inline def apply(reloaded: Boolean): Reloaded = {
    val __obj = js.Dynamic.literal(reloaded = reloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reloaded]
  }
  
  extension [Self <: Reloaded](x: Self) {
    
    inline def setReloaded(value: Boolean): Self = StObject.set(x, "reloaded", value.asInstanceOf[js.Any])
  }
}
