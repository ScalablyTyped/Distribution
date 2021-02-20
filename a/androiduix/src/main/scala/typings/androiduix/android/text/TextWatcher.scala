package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextWatcher extends StObject {
  
  def afterTextChanged(s: String): Unit = js.native
  
  def beforeTextChanged(s: String, start: Double, count: Double, after: Double): Unit = js.native
  
  def onTextChanged(s: String, start: Double, before: Double, count: Double): Unit = js.native
}
object TextWatcher {
  
  @scala.inline
  def apply(
    afterTextChanged: String => Unit,
    beforeTextChanged: (String, Double, Double, Double) => Unit,
    onTextChanged: (String, Double, Double, Double) => Unit
  ): TextWatcher = {
    val __obj = js.Dynamic.literal(afterTextChanged = js.Any.fromFunction1(afterTextChanged), beforeTextChanged = js.Any.fromFunction4(beforeTextChanged), onTextChanged = js.Any.fromFunction4(onTextChanged))
    __obj.asInstanceOf[TextWatcher]
  }
  
  @scala.inline
  implicit class TextWatcherMutableBuilder[Self <: TextWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTextChanged(value: String => Unit): Self = StObject.set(x, "afterTextChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeTextChanged(value: (String, Double, Double, Double) => Unit): Self = StObject.set(x, "beforeTextChanged", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnTextChanged(value: (String, Double, Double, Double) => Unit): Self = StObject.set(x, "onTextChanged", js.Any.fromFunction4(value))
  }
}
