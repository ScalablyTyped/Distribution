package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteUpdate extends StObject {
  
  /**
    * The updated note text.
    */
  var Text: NonEmptyString
  
  /**
    * The principal that updated the note.
    */
  var UpdatedBy: NonEmptyString
}
object NoteUpdate {
  
  inline def apply(Text: NonEmptyString, UpdatedBy: NonEmptyString): NoteUpdate = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], UpdatedBy = UpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteUpdate] (val x: Self) extends AnyVal {
    
    inline def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setUpdatedBy(value: NonEmptyString): Self = StObject.set(x, "UpdatedBy", value.asInstanceOf[js.Any])
  }
}
