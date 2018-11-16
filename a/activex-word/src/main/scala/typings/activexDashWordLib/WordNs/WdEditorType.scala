package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEditorType extends js.Object

@JSGlobal("Word.WdEditorType")
@js.native
object WdEditorType extends js.Object {
  @js.native
  sealed trait wdEditorCurrent
    extends activexDashWordLib.WordNs.WdEditorType
  
  @js.native
  sealed trait wdEditorEditors
    extends activexDashWordLib.WordNs.WdEditorType
  
  @js.native
  sealed trait wdEditorEveryone
    extends activexDashWordLib.WordNs.WdEditorType
  
  @js.native
  sealed trait wdEditorOwners
    extends activexDashWordLib.WordNs.WdEditorType
  
  /* -6 */ val wdEditorCurrent: wdEditorCurrent with scala.Double = js.native
  /* -5 */ val wdEditorEditors: wdEditorEditors with scala.Double = js.native
  /* -1 */ val wdEditorEveryone: wdEditorEveryone with scala.Double = js.native
  /* -4 */ val wdEditorOwners: wdEditorOwners with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEditorType with scala.Double] = js.native
}

