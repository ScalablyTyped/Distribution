package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDispAny extends StObject {
  
  val pDisp: js.Any
}
object PDispAny {
  
  inline def apply(pDisp: js.Any): PDispAny = {
    val __obj = js.Dynamic.literal(pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDispAny]
  }
  
  extension [Self <: PDispAny](x: Self) {
    
    inline def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
  }
}
