package typings.activexOffice

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUndoRedo extends js.Object {
  val InUndoRedo: Boolean
  val OldNextSibling: CustomXMLNode
  val OldNode: CustomXMLNode
  val OldParentNode: CustomXMLNode
}

object AnonInUndoRedo {
  @scala.inline
  def apply(
    InUndoRedo: Boolean,
    OldNextSibling: CustomXMLNode,
    OldNode: CustomXMLNode,
    OldParentNode: CustomXMLNode
  ): AnonInUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInUndoRedo]
  }
}

