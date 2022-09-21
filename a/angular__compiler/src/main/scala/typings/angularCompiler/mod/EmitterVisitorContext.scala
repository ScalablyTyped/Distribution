package typings.angularCompiler.mod

import typings.angularCompiler.anon.SourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "EmitterVisitorContext")
@js.native
open class EmitterVisitorContext protected () extends StObject {
  def this(_indent: Double) = this()
  
  /* private */ var _indent: Any = js.native
  
  /* private */ var _lines: Any = js.native
  
  def decIndent(): Unit = js.native
  
  def incIndent(): Unit = js.native
  
  def lineIsEmpty(): Boolean = js.native
  
  def lineLength(): Double = js.native
  
  def print(from: Null, part: String): Unit = js.native
  def print(from: Null, part: String, newLine: Boolean): Unit = js.native
  def print(from: SourceSpan, part: String): Unit = js.native
  def print(from: SourceSpan, part: String, newLine: Boolean): Unit = js.native
  
  def println(): Unit = js.native
  def println(from: Null, lastPart: String): Unit = js.native
  def println(from: Unit, lastPart: String): Unit = js.native
  def println(from: SourceSpan): Unit = js.native
  def println(from: SourceSpan, lastPart: String): Unit = js.native
  
  def removeEmptyLastLine(): Unit = js.native
  
  def spanOf(line: Double, column: Double): ParseSourceSpan | Null = js.native
  
  def toSource(): String = js.native
  
  def toSourceMapGenerator(genFilePath: String): SourceMapGenerator = js.native
  def toSourceMapGenerator(genFilePath: String, startsAtLine: Double): SourceMapGenerator = js.native
}
/* static members */
object EmitterVisitorContext {
  
  @JSImport("@angular/compiler", "EmitterVisitorContext")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRoot(): EmitterVisitorContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")().asInstanceOf[EmitterVisitorContext]
}
