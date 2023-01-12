package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/editorialnotes
trait EditorialNotes extends StObject {
  
  var short: String
  
  var standard: String
}
object EditorialNotes {
  
  inline def apply(short: String, standard: String): EditorialNotes = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorialNotes] (val x: Self) extends AnyVal {
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
