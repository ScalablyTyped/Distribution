package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  /**
    * The text of a note.
    */
  var Text: NonEmptyString
  
  /**
    * The timestamp of when the note was updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: NonEmptyString
  
  /**
    * The principal that created a note.
    */
  var UpdatedBy: NonEmptyString
}
object Note {
  
  inline def apply(Text: NonEmptyString, UpdatedAt: NonEmptyString, UpdatedBy: NonEmptyString): Note = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any], UpdatedBy = UpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    inline def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: NonEmptyString): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedBy(value: NonEmptyString): Self = StObject.set(x, "UpdatedBy", value.asInstanceOf[js.Any])
  }
}
