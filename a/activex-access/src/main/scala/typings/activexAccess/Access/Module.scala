package typings.activexAccess.Access

import typings.activexVbide.VBIDE.vbextProcKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Module")
@js.native
class Module protected () extends js.Object {
  @JSName("Access.Module_typekey")
  var AccessDotModule_typekey: Module = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  val CountOfDeclarationLines: Double = js.native
  val CountOfLines: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val Type: AcModuleType = js.native
  def AddFromFile(FileName: String): Unit = js.native
  def AddFromString(String: String): Unit = js.native
  def CreateEventProc(EventName: String, ObjectName: String): Double = js.native
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
  def InsertText(Text: String): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Lines(Line: Double, NumLines: Double): String = js.native
  def ProcBodyLine(ProcName: String, ProcKind: vbextProcKind): Double = js.native
  def ProcCountLines(ProcName: String, ProcKind: vbextProcKind): Double = js.native
  def ProcOfLine(Line: Double, pprockind: vbextProcKind): String = js.native
  def ProcStartLine(ProcName: String, ProcKind: vbextProcKind): Double = js.native
  def ReplaceLine(Line: Double, String: String): Unit = js.native
}

