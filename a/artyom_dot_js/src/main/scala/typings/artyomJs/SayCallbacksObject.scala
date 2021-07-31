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
  
  @scala.inline
  def apply(): SayCallbacksObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SayCallbacksObject]
  }
  
  @scala.inline
  implicit class SayCallbacksObjectMutableBuilder[Self <: SayCallbacksObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: js.Function): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
