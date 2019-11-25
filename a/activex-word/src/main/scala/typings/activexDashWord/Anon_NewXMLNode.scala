package typings.activexDashWord

import typings.activexDashWord.Word.Selection
import typings.activexDashWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewXMLNode extends js.Object {
  val NewXMLNode: XMLNode
  val OldXMLNode: XMLNode
  val Reason: Double
  val Sel: Selection
}

object Anon_NewXMLNode {
  @scala.inline
  def apply(NewXMLNode: XMLNode, OldXMLNode: XMLNode, Reason: Double, Sel: Selection): Anon_NewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NewXMLNode]
  }
}

