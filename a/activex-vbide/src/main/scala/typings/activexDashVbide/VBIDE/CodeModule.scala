package typings.activexDashVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.CodeModule")
@js.native
class CodeModule protected () extends js.Object {
  val CodePane: typings.activexDashVbide.VBIDE.CodePane = js.native
  val CountOfDeclarationLines: Double = js.native
  val CountOfLines: Double = js.native
  var Name: String = js.native
  val Parent: VBComponent = js.native
  val VBE: typings.activexDashVbide.VBIDE.VBE = js.native
  var `VBIDE.CodeModule_typekey`: CodeModule = js.native
  def AddFromFile(FileName: String): Unit = js.native
  def AddFromString(String: String): Unit = js.native
  def CreateEventProc(EventName: String, ObjectName: String): Double = js.native
  /** @param Count [Count=1] */
  def DeleteLines(StartLine: Double): Unit = js.native
  def DeleteLines(StartLine: Double, Count: Double): Unit = js.native
  /**
    * @param WholeWord [WholeWord=false]
    * @param MatchCase [MatchCase=false]
    * @param PatternSearch [PatternSearch=false]
    */
  def Find(Target: String, StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Boolean = js.native
  def Find(
    Target: String,
    StartLine: Double,
    StartColumn: Double,
    EndLine: Double,
    EndColumn: Double,
    WholeWord: Boolean
  ): Boolean = js.native
  def Find(
    Target: String,
    StartLine: Double,
    StartColumn: Double,
    EndLine: Double,
    EndColumn: Double,
    WholeWord: Boolean,
    MatchCase: Boolean
  ): Boolean = js.native
  def Find(
    Target: String,
    StartLine: Double,
    StartColumn: Double,
    EndLine: Double,
    EndColumn: Double,
    WholeWord: Boolean,
    MatchCase: Boolean,
    PatternSearch: Boolean
  ): Boolean = js.native
  def InsertLines(Line: Double, String: String): Unit = js.native
  def Lines(StartLine: Double, Count: Double): String = js.native
  def ProcBodyLine(ProcName: String, ProcKind: vbext_ProcKind): Double = js.native
  def ProcCountLines(ProcName: String, ProcKind: vbext_ProcKind): Double = js.native
  def ProcOfLine(Line: Double, ProcKind: vbext_ProcKind): String = js.native
  def ProcStartLine(ProcName: String, ProcKind: vbext_ProcKind): Double = js.native
  def ReplaceLine(Line: Double, String: String): Unit = js.native
}

