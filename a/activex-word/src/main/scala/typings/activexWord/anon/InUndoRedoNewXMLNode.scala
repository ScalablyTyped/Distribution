package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InUndoRedoNewXMLNode extends js.Object {
  val InUndoRedo: Boolean
  val NewXMLNode: typings.activexWord.Word.XMLNode
}

object InUndoRedoNewXMLNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewXMLNode: typings.activexWord.Word.XMLNode): InUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedoNewXMLNode]
  }
}

