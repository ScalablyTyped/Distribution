package typings
package atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_emitter", "EmitterVisitorContext")
@js.native
class EmitterVisitorContext protected () extends js.Object {
  def this(_indent: scala.Double) = this()
  var _classes: js.Any = js.native
  val _currentLine: js.Any = js.native
  var _indent: js.Any = js.native
  var _lines: js.Any = js.native
  var _preambleLineCount: js.Any = js.native
  val currentClass: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ClassStmt | scala.Null = js.native
  val sourceLines: js.Any = js.native
  def decIndent(): scala.Unit = js.native
  def incIndent(): scala.Unit = js.native
  def lineIsEmpty(): scala.Boolean = js.native
  def lineLength(): scala.Double = js.native
  def popClass(): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ClassStmt = js.native
  def print(from: atAngularCompilerLib.Anon_SourceSpan, part: java.lang.String): scala.Unit = js.native
  def print(from: atAngularCompilerLib.Anon_SourceSpan, part: java.lang.String, newLine: scala.Boolean): scala.Unit = js.native
  def print(from: scala.Null, part: java.lang.String): scala.Unit = js.native
  def print(from: scala.Null, part: java.lang.String, newLine: scala.Boolean): scala.Unit = js.native
  def println(): scala.Unit = js.native
  def println(from: atAngularCompilerLib.Anon_SourceSpan): scala.Unit = js.native
  def println(from: atAngularCompilerLib.Anon_SourceSpan, lastPart: java.lang.String): scala.Unit = js.native
  def println(from: scala.Null, lastPart: java.lang.String): scala.Unit = js.native
  def pushClass(clazz: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ClassStmt): scala.Unit = js.native
  def removeEmptyLastLine(): scala.Unit = js.native
  def setPreambleLineCount(count: scala.Double): scala.Double = js.native
  def spanOf(line: scala.Double, column: scala.Double): atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  def toSource(): java.lang.String = js.native
  def toSourceMapGenerator(genFilePath: java.lang.String): atAngularCompilerLib.srcOutputSourceUnderscoreMapMod.SourceMapGenerator = js.native
  def toSourceMapGenerator(genFilePath: java.lang.String, startsAtLine: scala.Double): atAngularCompilerLib.srcOutputSourceUnderscoreMapMod.SourceMapGenerator = js.native
}

/* static members */
@JSImport("@angular/compiler/src/output/abstract_emitter", "EmitterVisitorContext")
@js.native
object EmitterVisitorContext extends js.Object {
  def createRoot(): atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext = js.native
}

