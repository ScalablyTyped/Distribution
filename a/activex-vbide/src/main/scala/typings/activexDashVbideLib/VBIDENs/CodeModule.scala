package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.CodeModule")
@js.native
class CodeModule protected () extends js.Object {
  val CodePane: activexDashVbideLib.VBIDENs.CodePane = js.native
  val CountOfDeclarationLines: scala.Double = js.native
  val CountOfLines: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Parent: VBComponent = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  var `VBIDE.CodeModule_typekey`: CodeModule = js.native
  def AddFromFile(FileName: java.lang.String): scala.Unit = js.native
  def AddFromString(String: java.lang.String): scala.Unit = js.native
  def CreateEventProc(EventName: java.lang.String, ObjectName: java.lang.String): scala.Double = js.native
  /** @param Count [Count=1] */
  def DeleteLines(StartLine: scala.Double): scala.Unit = js.native
  def DeleteLines(StartLine: scala.Double, Count: scala.Double): scala.Unit = js.native
  /**
    * @param WholeWord [WholeWord=false]
    * @param MatchCase [MatchCase=false]
    * @param PatternSearch [PatternSearch=false]
    */
  def Find(
    Target: java.lang.String,
    StartLine: scala.Double,
    StartColumn: scala.Double,
    EndLine: scala.Double,
    EndColumn: scala.Double
  ): scala.Boolean = js.native
  def Find(
    Target: java.lang.String,
    StartLine: scala.Double,
    StartColumn: scala.Double,
    EndLine: scala.Double,
    EndColumn: scala.Double,
    WholeWord: scala.Boolean
  ): scala.Boolean = js.native
  def Find(
    Target: java.lang.String,
    StartLine: scala.Double,
    StartColumn: scala.Double,
    EndLine: scala.Double,
    EndColumn: scala.Double,
    WholeWord: scala.Boolean,
    MatchCase: scala.Boolean
  ): scala.Boolean = js.native
  def Find(
    Target: java.lang.String,
    StartLine: scala.Double,
    StartColumn: scala.Double,
    EndLine: scala.Double,
    EndColumn: scala.Double,
    WholeWord: scala.Boolean,
    MatchCase: scala.Boolean,
    PatternSearch: scala.Boolean
  ): scala.Boolean = js.native
  def InsertLines(Line: scala.Double, String: java.lang.String): scala.Unit = js.native
  def Lines(StartLine: scala.Double, Count: scala.Double): java.lang.String = js.native
  def ProcBodyLine(ProcName: java.lang.String, ProcKind: vbext_ProcKind): scala.Double = js.native
  def ProcCountLines(ProcName: java.lang.String, ProcKind: vbext_ProcKind): scala.Double = js.native
  def ProcOfLine(Line: scala.Double, ProcKind: vbext_ProcKind): java.lang.String = js.native
  def ProcStartLine(ProcName: java.lang.String, ProcKind: vbext_ProcKind): scala.Double = js.native
  def ReplaceLine(Line: scala.Double, String: java.lang.String): scala.Unit = js.native
}

