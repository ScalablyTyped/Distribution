package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Note extends js.Object {
  /**
    * The text of a note.
    */
  var Text: NonEmptyString
  /**
    * The timestamp of when the note was updated.
    */
  var UpdatedAt: NonEmptyString
  /**
    * The principal that created a note.
    */
  var UpdatedBy: NonEmptyString
}

object Note {
  @scala.inline
  def apply(Text: NonEmptyString, UpdatedAt: NonEmptyString, UpdatedBy: NonEmptyString): Note = {
    val __obj = js.Dynamic.literal(Text = Text, UpdatedAt = UpdatedAt, UpdatedBy = UpdatedBy)
  
    __obj.asInstanceOf[Note]
  }
}

