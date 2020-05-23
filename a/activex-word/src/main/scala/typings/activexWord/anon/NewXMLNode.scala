package typings.activexWord.anon

import typings.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewXMLNode extends js.Object {
  val NewXMLNode: typings.activexWord.Word.XMLNode
  val OldXMLNode: typings.activexWord.Word.XMLNode
  val Reason: Double
  val Sel: Selection
}

object NewXMLNode {
  @scala.inline
  def apply(
    NewXMLNode: typings.activexWord.Word.XMLNode,
    OldXMLNode: typings.activexWord.Word.XMLNode,
    Reason: Double,
    Sel: Selection
  ): NewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewXMLNode]
  }
}

