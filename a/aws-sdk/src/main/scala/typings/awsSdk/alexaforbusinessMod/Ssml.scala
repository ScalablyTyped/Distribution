package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ssml extends StObject {
  
  /**
    * The locale of the SSML message. Currently, en-US is supported.
    */
  var Locale: typings.awsSdk.alexaforbusinessMod.Locale
  
  /**
    * The value of the SSML message in the correct SSML format. The audio tag is not supported.
    */
  var Value: SsmlValue
}
object Ssml {
  
  inline def apply(Locale: Locale, Value: SsmlValue): Ssml = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssml]
  }
  
  extension [Self <: Ssml](x: Self) {
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SsmlValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
