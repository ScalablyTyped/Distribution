package typings.activexWord

import typings.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUndoRedoNewXMLNode extends js.Object {
  val InUndoRedo: Boolean
  val NewXMLNode: XMLNode
}

object AnonInUndoRedoNewXMLNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewXMLNode: XMLNode): AnonInUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInUndoRedoNewXMLNode]
  }
}

