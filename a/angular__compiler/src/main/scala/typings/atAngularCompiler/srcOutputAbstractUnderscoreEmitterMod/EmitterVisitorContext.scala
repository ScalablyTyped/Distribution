package typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod

import typings.atAngularCompiler.Anon_SourceSpan
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ClassStmt
import typings.atAngularCompiler.srcOutputSourceUnderscoreMapMod.SourceMapGenerator
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_emitter", "EmitterVisitorContext")
@js.native
class EmitterVisitorContext protected () extends js.Object {
  def this(_indent: Double) = this()
  var _classes: js.Any = js.native
  val _currentLine: js.Any = js.native
  var _indent: js.Any = js.native
  var _lines: js.Any = js.native
  var _preambleLineCount: js.Any = js.native
  val currentClass: ClassStmt | Null = js.native
  val sourceLines: js.Any = js.native
  def decIndent(): Unit = js.native
  def incIndent(): Unit = js.native
  def lineIsEmpty(): Boolean = js.native
  def lineLength(): Double = js.native
  def popClass(): ClassStmt = js.native
  def print(from: Null, part: String): Unit = js.native
  def print(from: Null, part: String, newLine: Boolean): Unit = js.native
  def print(from: Anon_SourceSpan, part: String): Unit = js.native
  def print(from: Anon_SourceSpan, part: String, newLine: Boolean): Unit = js.native
  def println(): Unit = js.native
  def println(from: Null, lastPart: String): Unit = js.native
  def println(from: Anon_SourceSpan): Unit = js.native
  def println(from: Anon_SourceSpan, lastPart: String): Unit = js.native
  def pushClass(clazz: ClassStmt): Unit = js.native
  def removeEmptyLastLine(): Unit = js.native
  def setPreambleLineCount(count: Double): Double = js.native
  def spanOf(line: Double, column: Double): ParseSourceSpan | Null = js.native
  def toSource(): String = js.native
  def toSourceMapGenerator(genFilePath: String): SourceMapGenerator = js.native
  def toSourceMapGenerator(genFilePath: String, startsAtLine: Double): SourceMapGenerator = js.native
}

/* static members */
@JSImport("@angular/compiler/src/output/abstract_emitter", "EmitterVisitorContext")
@js.native
object EmitterVisitorContext extends js.Object {
  def createRoot(): EmitterVisitorContext = js.native
}

