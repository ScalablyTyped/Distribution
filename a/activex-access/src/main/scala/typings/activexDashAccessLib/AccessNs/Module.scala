package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Module")
@js.native
class Module protected () extends js.Object {
  var `Access.Module_typekey`: Module = js.native
  val Application: activexDashAccessLib.AccessNs.Application = js.native
  val CountOfDeclarationLines: scala.Double = js.native
  val CountOfLines: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Type: AcModuleType = js.native
  def AddFromFile(FileName: java.lang.String): scala.Unit = js.native
  def AddFromString(String: java.lang.String): scala.Unit = js.native
  def CreateEventProc(EventName: java.lang.String, ObjectName: java.lang.String): scala.Double = js.native
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
  def InsertText(Text: java.lang.String): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Lines(Line: scala.Double, NumLines: scala.Double): java.lang.String = js.native
  def ProcBodyLine(ProcName: java.lang.String, ProcKind: activexDashVbideLib.VBIDENs.vbext_ProcKind): scala.Double = js.native
  def ProcCountLines(ProcName: java.lang.String, ProcKind: activexDashVbideLib.VBIDENs.vbext_ProcKind): scala.Double = js.native
  def ProcOfLine(Line: scala.Double, pprockind: activexDashVbideLib.VBIDENs.vbext_ProcKind): java.lang.String = js.native
  def ProcStartLine(ProcName: java.lang.String, ProcKind: activexDashVbideLib.VBIDENs.vbext_ProcKind): scala.Double = js.native
  def ReplaceLine(Line: scala.Double, String: java.lang.String): scala.Unit = js.native
}

