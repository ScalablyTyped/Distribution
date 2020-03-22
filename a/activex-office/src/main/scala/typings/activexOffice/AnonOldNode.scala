package typings.activexOffice

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
  val OldNode: CustomXMLNode
}

object AnonOldNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): AnonOldNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOldNode]
  }
}

