package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteUpdate extends js.Object {
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
  @scala.inline
  def apply(Text: NonEmptyString, UpdatedBy: NonEmptyString): NoteUpdate = {
    val __obj = js.Dynamic.literal(Text = Text, UpdatedBy = UpdatedBy)
  
    __obj.asInstanceOf[NoteUpdate]
  }
}

