package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InUndoRedo extends js.Object {
  val InUndoRedo: Boolean
  val OldNextSibling: CustomXMLNode
  val OldNode: CustomXMLNode
  val OldParentNode: CustomXMLNode
}

object InUndoRedo {
  @scala.inline
  def apply(
    InUndoRedo: Boolean,
    OldNextSibling: CustomXMLNode,
    OldNode: CustomXMLNode,
    OldParentNode: CustomXMLNode
  ): InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedo]
  }
}

