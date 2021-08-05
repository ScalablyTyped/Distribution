package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotate extends StObject {
  
  var rotate: String
}
object Rotate {
  
  inline def apply(rotate: String): Rotate = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotate]
  }
  
  extension [Self <: Rotate](x: Self) {
    
    inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
