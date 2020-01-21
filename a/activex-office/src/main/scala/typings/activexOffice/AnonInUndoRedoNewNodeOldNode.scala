package typings.activexOffice

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUndoRedoNewNodeOldNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
  val OldNode: CustomXMLNode
}

object AnonInUndoRedoNewNodeOldNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): AnonInUndoRedoNewNodeOldNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInUndoRedoNewNodeOldNode]
  }
}

