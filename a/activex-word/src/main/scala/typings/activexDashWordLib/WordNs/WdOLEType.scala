package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOLEType extends js.Object

@JSGlobal("Word.WdOLEType")
@js.native
object WdOLEType extends js.Object {
  @js.native
  sealed trait wdOLEControl
    extends activexDashWordLib.WordNs.WdOLEType
  
  @js.native
  sealed trait wdOLEEmbed
    extends activexDashWordLib.WordNs.WdOLEType
  
  @js.native
  sealed trait wdOLELink
    extends activexDashWordLib.WordNs.WdOLEType
  
  /* 2 */ val wdOLEControl: wdOLEControl with scala.Double = js.native
  /* 1 */ val wdOLEEmbed: wdOLEEmbed with scala.Double = js.native
  /* 0 */ val wdOLELink: wdOLELink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOLEType with scala.Double] = js.native
}

