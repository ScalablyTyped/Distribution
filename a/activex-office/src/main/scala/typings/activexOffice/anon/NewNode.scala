package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
}

object NewNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): NewNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewNode]
  }
}

