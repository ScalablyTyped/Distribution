package typings.atAngularCompiler.srcUtilMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dashCaseToCamelCase(input: String): String = js.native
  def error(msg: String): scala.Nothing = js.native
  def escapeRegExp(s: String): String = js.native
  def getParseErrors(error: Error): js.Array[ParseError] = js.native
  def isDefined(`val`: js.Any): Boolean = js.native
  def isPromise(obj: js.Any): /* is std.Promise<any> */ Boolean = js.native
  def isSyntaxError(error: Error): Boolean = js.native
  def noUndefined[T](): T = js.native
  def noUndefined[T](`val`: T): T = js.native
  def resolveForwardRef(`type`: js.Any): js.Any = js.native
  def splitAtColon(input: String, defaultValues: js.Array[String]): js.Array[String] = js.native
  def splitAtPeriod(input: String, defaultValues: js.Array[String]): js.Array[String] = js.native
  def stringify(token: js.Any): String = js.native
  def syntaxError(msg: String): Error = js.native
  def syntaxError(msg: String, parseErrors: js.Array[ParseError]): Error = js.native
  def utf8Encode(str: String): String = js.native
  def visitValue(value: js.Any, visitor: ValueVisitor, context: js.Any): js.Any = js.native
}

