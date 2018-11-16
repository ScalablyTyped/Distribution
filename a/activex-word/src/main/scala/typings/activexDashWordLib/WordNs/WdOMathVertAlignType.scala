package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathVertAlignType extends js.Object

@JSGlobal("Word.WdOMathVertAlignType")
@js.native
object WdOMathVertAlignType extends js.Object {
  @js.native
  sealed trait wdOMathVertAlignBottom
    extends activexDashWordLib.WordNs.WdOMathVertAlignType
  
  @js.native
  sealed trait wdOMathVertAlignCenter
    extends activexDashWordLib.WordNs.WdOMathVertAlignType
  
  @js.native
  sealed trait wdOMathVertAlignTop
    extends activexDashWordLib.WordNs.WdOMathVertAlignType
  
  /* 2 */ val wdOMathVertAlignBottom: wdOMathVertAlignBottom with scala.Double = js.native
  /* 0 */ val wdOMathVertAlignCenter: wdOMathVertAlignCenter with scala.Double = js.native
  /* 1 */ val wdOMathVertAlignTop: wdOMathVertAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathVertAlignType with scala.Double] = js.native
}

