package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.CodePane")
@js.native
class CodePane protected () extends js.Object {
  val CodeModule: activexDashVbideLib.VBIDENs.CodeModule = js.native
  val CodePaneView: vbext_CodePaneview = js.native
  @JSName("Collection")
  val Collection_Original: CodePanes = js.native
  val CountOfVisibleLines: scala.Double = js.native
  var TopLine: scala.Double = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  var `VBIDE.CodePane_typekey`: CodePane = js.native
  val Window: activexDashVbideLib.VBIDENs.Window = js.native
  def Collection(index: js.Any): CodePane = js.native
  def GetSelection(StartLine: scala.Double, StartColumn: scala.Double, EndLine: scala.Double, EndColumn: scala.Double): scala.Unit = js.native
  def SetSelection(StartLine: scala.Double, StartColumn: scala.Double, EndLine: scala.Double, EndColumn: scala.Double): scala.Unit = js.native
  def Show(): scala.Unit = js.native
}

