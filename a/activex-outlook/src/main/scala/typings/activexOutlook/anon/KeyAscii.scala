package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAscii extends StObject {
  
  val KeyAscii: Double
}
object KeyAscii {
  
  inline def apply(KeyAscii: Double): KeyAscii = {
    val __obj = js.Dynamic.literal(KeyAscii = KeyAscii.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAscii]
  }
  
  extension [Self <: KeyAscii](x: Self) {
    
    inline def setKeyAscii(value: Double): Self = StObject.set(x, "KeyAscii", value.asInstanceOf[js.Any])
  }
}
