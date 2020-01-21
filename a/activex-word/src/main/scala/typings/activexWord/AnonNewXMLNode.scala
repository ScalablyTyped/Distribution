package typings.activexWord

import typings.activexWord.Word.Selection
import typings.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewXMLNode extends js.Object {
  val NewXMLNode: XMLNode
  val OldXMLNode: XMLNode
  val Reason: Double
  val Sel: Selection
}

object AnonNewXMLNode {
  @scala.inline
  def apply(NewXMLNode: XMLNode, OldXMLNode: XMLNode, Reason: Double, Sel: Selection): AnonNewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewXMLNode]
  }
}

