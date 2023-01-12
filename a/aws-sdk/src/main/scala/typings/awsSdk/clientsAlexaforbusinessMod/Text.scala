package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  /**
    * The locale of the text message. Currently, en-US is supported.
    */
  var Locale: typings.awsSdk.clientsAlexaforbusinessMod.Locale
  
  /**
    * The value of the text message.
    */
  var Value: TextValue
}
object Text {
  
  inline def apply(Locale: Locale, Value: TextValue): Text = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TextValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
