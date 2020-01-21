package typings.activexOffice

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUndoRedoNewNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
}

object AnonInUndoRedoNewNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): AnonInUndoRedoNewNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInUndoRedoNewNode]
  }
}

