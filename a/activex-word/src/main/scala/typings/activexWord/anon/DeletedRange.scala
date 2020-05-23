package typings.activexWord.anon

import typings.activexWord.Word.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedRange extends js.Object {
  val DeletedRange: Range
  val InUndoRedo: Boolean
  val OldXMLNode: typings.activexWord.Word.XMLNode
}

object DeletedRange {
  @scala.inline
  def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: typings.activexWord.Word.XMLNode): DeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedRange]
  }
}

