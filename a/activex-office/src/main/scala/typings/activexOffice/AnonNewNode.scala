package typings.activexOffice

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewNode extends js.Object {
  val InUndoRedo: Boolean
  val NewNode: CustomXMLNode
}

object AnonNewNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): AnonNewNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewNode]
  }
}

