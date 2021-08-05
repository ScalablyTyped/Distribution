package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SayCallbacksObject extends StObject {
  
  var lang: js.UndefOr[String] = js.undefined
  
  var onEnd: js.UndefOr[js.Function] = js.undefined
  
  var onStart: js.UndefOr[js.Function] = js.undefined
}
object SayCallbacksObject {
  
  inline def apply(): SayCallbacksObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SayCallbacksObject]
  }
  
  extension [Self <: SayCallbacksObject](x: Self) {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: js.Function): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
