package typings.activexDashOffice

import typings.activexDashOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedoNewNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
}

object Anon_InUndoRedoNewNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): Anon_InUndoRedoNewNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InUndoRedoNewNode]
  }
}

