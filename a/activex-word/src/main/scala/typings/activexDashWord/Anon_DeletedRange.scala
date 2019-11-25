package typings.activexDashWord

import typings.activexDashWord.Word.Range
import typings.activexDashWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeletedRange extends js.Object {
  val DeletedRange: Range
  val InUndoRedo: Boolean
  val OldXMLNode: XMLNode
}

object Anon_DeletedRange {
  @scala.inline
  def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: XMLNode): Anon_DeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeletedRange]
  }
}

