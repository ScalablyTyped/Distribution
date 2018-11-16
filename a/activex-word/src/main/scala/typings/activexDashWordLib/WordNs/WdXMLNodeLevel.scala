package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdXMLNodeLevel extends js.Object

@JSGlobal("Word.WdXMLNodeLevel")
@js.native
object WdXMLNodeLevel extends js.Object {
  @js.native
  sealed trait wdXMLNodeLevelCell
    extends activexDashWordLib.WordNs.WdXMLNodeLevel
  
  @js.native
  sealed trait wdXMLNodeLevelInline
    extends activexDashWordLib.WordNs.WdXMLNodeLevel
  
  @js.native
  sealed trait wdXMLNodeLevelParagraph
    extends activexDashWordLib.WordNs.WdXMLNodeLevel
  
  @js.native
  sealed trait wdXMLNodeLevelRow
    extends activexDashWordLib.WordNs.WdXMLNodeLevel
  
  /* 3 */ val wdXMLNodeLevelCell: wdXMLNodeLevelCell with scala.Double = js.native
  /* 0 */ val wdXMLNodeLevelInline: wdXMLNodeLevelInline with scala.Double = js.native
  /* 1 */ val wdXMLNodeLevelParagraph: wdXMLNodeLevelParagraph with scala.Double = js.native
  /* 2 */ val wdXMLNodeLevelRow: wdXMLNodeLevelRow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdXMLNodeLevel with scala.Double] = js.native
}

