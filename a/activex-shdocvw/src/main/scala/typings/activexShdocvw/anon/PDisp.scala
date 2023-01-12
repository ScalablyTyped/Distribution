package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDisp extends StObject {
  
  val URL: Any
  
  val pDisp: Any
}
object PDisp {
  
  inline def apply(URL: Any, pDisp: Any): PDisp = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDisp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDisp] (val x: Self) extends AnyVal {
    
    inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
