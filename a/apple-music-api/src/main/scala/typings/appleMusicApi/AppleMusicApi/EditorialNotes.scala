package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/editorialnotes
@js.native
trait EditorialNotes extends StObject {
  
  var short: String = js.native
  
  var standard: String = js.native
}
object EditorialNotes {
  
  @scala.inline
  def apply(short: String, standard: String): EditorialNotes = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
  
  @scala.inline
  implicit class EditorialNotesMutableBuilder[Self <: EditorialNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
