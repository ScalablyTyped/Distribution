package typings
package atAngularCompilerLib.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dashCaseToCamelCase(input: java.lang.String): java.lang.String = js.native
  def error(msg: java.lang.String): scala.Nothing = js.native
  def escapeRegExp(s: java.lang.String): java.lang.String = js.native
  def getParseErrors(error: stdLib.Error): js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError] = js.native
  def isDefined(`val`: js.Any): scala.Boolean = js.native
  def isPromise(obj: js.Any): /* is std.Promise<any> */ scala.Boolean = js.native
  def isSyntaxError(error: stdLib.Error): scala.Boolean = js.native
  def noUndefined[T](): T = js.native
  def noUndefined[T](`val`: T): T = js.native
  def resolveForwardRef(`type`: js.Any): js.Any = js.native
  def splitAtColon(input: java.lang.String, defaultValues: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def splitAtPeriod(input: java.lang.String, defaultValues: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def stringify(token: js.Any): java.lang.String = js.native
  def syntaxError(msg: java.lang.String): stdLib.Error = js.native
  def syntaxError(
    msg: java.lang.String,
    parseErrors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]
  ): stdLib.Error = js.native
  def utf8Encode(str: java.lang.String): java.lang.String = js.native
  def visitValue(value: js.Any, visitor: ValueVisitor, context: js.Any): js.Any = js.native
}

