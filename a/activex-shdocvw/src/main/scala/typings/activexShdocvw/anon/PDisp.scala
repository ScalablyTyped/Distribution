package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDisp extends StObject {
  
  val URL: js.Any
  
  val pDisp: js.Any
}
object PDisp {
  
  @scala.inline
  def apply(URL: js.Any, pDisp: js.Any): PDisp = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDisp]
  }
  
  @scala.inline
  implicit class PDispMutableBuilder[Self <: PDisp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: js.Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
