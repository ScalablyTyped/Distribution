package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdXMLNodeType extends js.Object

@JSGlobal("Word.WdXMLNodeType")
@js.native
object WdXMLNodeType extends js.Object {
  @js.native
  sealed trait wdXMLNodeAttribute
    extends activexDashWordLib.WordNs.WdXMLNodeType
  
  @js.native
  sealed trait wdXMLNodeElement
    extends activexDashWordLib.WordNs.WdXMLNodeType
  
  /* 2 */ val wdXMLNodeAttribute: wdXMLNodeAttribute with scala.Double = js.native
  /* 1 */ val wdXMLNodeElement: wdXMLNodeElement with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdXMLNodeType with scala.Double] = js.native
}

