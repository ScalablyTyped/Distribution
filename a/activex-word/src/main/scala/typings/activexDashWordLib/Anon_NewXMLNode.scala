package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewXMLNode extends js.Object {
  val NewXMLNode: activexDashWordLib.WordNs.XMLNode
  val OldXMLNode: activexDashWordLib.WordNs.XMLNode
  val Reason: scala.Double
  val Sel: activexDashWordLib.WordNs.Selection
}

object Anon_NewXMLNode {
  @scala.inline
  def apply(
    NewXMLNode: activexDashWordLib.WordNs.XMLNode,
    OldXMLNode: activexDashWordLib.WordNs.XMLNode,
    Reason: scala.Double,
    Sel: activexDashWordLib.WordNs.Selection
  ): Anon_NewXMLNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NewXMLNode")(NewXMLNode)
    __obj.updateDynamic("OldXMLNode")(OldXMLNode)
    __obj.updateDynamic("Reason")(Reason)
    __obj.updateDynamic("Sel")(Sel)
    __obj.asInstanceOf[Anon_NewXMLNode]
  }
}

