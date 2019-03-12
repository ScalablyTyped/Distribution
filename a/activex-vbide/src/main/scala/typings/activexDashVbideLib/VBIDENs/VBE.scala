package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.VBE")
@js.native
class VBE protected () extends js.Object {
  var ActiveCodePane: CodePane = js.native
  var ActiveVBProject: VBProject = js.native
  val ActiveWindow: Window = js.native
  @JSName("Addins")
  val Addins_Original: Addins = js.native
  @JSName("CodePanes")
  val CodePanes_Original: CodePanes = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val Events: activexDashVbideLib.VBIDENs.Events = js.native
  val MainWindow: Window = js.native
  val SelectedVBComponent: VBComponent = js.native
  var `VBIDE.VBE_typekey`: VBE = js.native
  @JSName("VBProjects")
  val VBProjects_Original: VBProjects = js.native
  val Version: java.lang.String = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
  def Addins(index: js.Any): AddIn = js.native
  def CodePanes(index: js.Any): CodePane = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def VBProjects(index: js.Any): VBProject = js.native
  def Windows(index: js.Any): Window = js.native
}

