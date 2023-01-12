package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ahead extends StObject {
  
  var ahead: Double
  
  var behind: Double
}
object Ahead {
  
  inline def apply(ahead: Double, behind: Double): Ahead = {
    val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], behind = behind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ahead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ahead] (val x: Self) extends AnyVal {
    
    inline def setAhead(value: Double): Self = StObject.set(x, "ahead", value.asInstanceOf[js.Any])
    
    inline def setBehind(value: Double): Self = StObject.set(x, "behind", value.asInstanceOf[js.Any])
  }
}
