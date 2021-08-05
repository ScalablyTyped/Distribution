package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ghost extends StObject {
  
  var ghost: Boolean
}
object Ghost {
  
  inline def apply(ghost: Boolean): Ghost = {
    val __obj = js.Dynamic.literal(ghost = ghost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost]
  }
  
  extension [Self <: Ghost](x: Self) {
    
    inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
  }
}
