package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  def text(): js.Promise[String]
}
object Text {
  
  @scala.inline
  def apply(text: () => js.Promise[String]): Text = {
    val __obj = js.Dynamic.literal(text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
