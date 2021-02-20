package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends StObject {
  
  /**
    * The locale of the text message. Currently, en-US is supported.
    */
  var Locale: typings.awsSdk.alexaforbusinessMod.Locale = js.native
  
  /**
    * The value of the text message.
    */
  var Value: TextValue = js.native
}
object Text {
  
  @scala.inline
  def apply(Locale: Locale, Value: TextValue): Text = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TextValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
