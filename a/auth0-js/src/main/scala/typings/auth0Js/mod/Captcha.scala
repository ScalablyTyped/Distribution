package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Captcha extends StObject {
  
  def getValue(): String
  
  def reload(done: DoneCallback): Unit
}
object Captcha {
  
  inline def apply(getValue: () => String, reload: DoneCallback => Unit): Captcha = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), reload = js.Any.fromFunction1(reload))
    __obj.asInstanceOf[Captcha]
  }
  
  extension [Self <: Captcha](x: Self) {
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setReload(value: DoneCallback => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
  }
}
