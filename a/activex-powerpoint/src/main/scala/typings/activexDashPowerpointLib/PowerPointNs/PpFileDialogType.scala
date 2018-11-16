package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpFileDialogType extends js.Object

@JSGlobal("PowerPoint.PpFileDialogType")
@js.native
object PpFileDialogType extends js.Object {
  @js.native
  sealed trait ppFileDialogOpen
    extends activexDashPowerpointLib.PowerPointNs.PpFileDialogType
  
  @js.native
  sealed trait ppFileDialogSave
    extends activexDashPowerpointLib.PowerPointNs.PpFileDialogType
  
  /* 1 */ val ppFileDialogOpen: ppFileDialogOpen with scala.Double = js.native
  /* 2 */ val ppFileDialogSave: ppFileDialogSave with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpFileDialogType with scala.Double] = js.native
}

