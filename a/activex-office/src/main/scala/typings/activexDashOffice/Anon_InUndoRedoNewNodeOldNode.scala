package typings.activexDashOffice

import typings.activexDashOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedoNewNodeOldNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
  val OldNode: CustomXMLNode
}

object Anon_InUndoRedoNewNodeOldNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): Anon_InUndoRedoNewNodeOldNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InUndoRedoNewNodeOldNode]
  }
}

