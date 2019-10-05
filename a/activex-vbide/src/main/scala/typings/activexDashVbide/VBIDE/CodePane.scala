package typings.activexDashVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.CodePane")
@js.native
class CodePane protected () extends js.Object {
  val CodeModule: typings.activexDashVbide.VBIDE.CodeModule = js.native
  val CodePaneView: vbext_CodePaneview = js.native
  @JSName("Collection")
  val Collection_Original: CodePanes = js.native
  val CountOfVisibleLines: Double = js.native
  var TopLine: Double = js.native
  val VBE: typings.activexDashVbide.VBIDE.VBE = js.native
  var `VBIDE.CodePane_typekey`: CodePane = js.native
  val Window: typings.activexDashVbide.VBIDE.Window = js.native
  def Collection(index: js.Any): CodePane = js.native
  def GetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
  def SetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
  def Show(): Unit = js.native
}

