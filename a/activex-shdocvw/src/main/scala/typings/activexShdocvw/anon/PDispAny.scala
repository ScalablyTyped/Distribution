package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDispAny extends StObject {
  
  val pDisp: Any
}
object PDispAny {
  
  inline def apply(pDisp: Any): PDispAny = {
    val __obj = js.Dynamic.literal(pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDispAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDispAny] (val x: Self) extends AnyVal {
    
    inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
  }
}
