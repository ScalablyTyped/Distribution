package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LooseParser: js.UndefOr[ILooseParserClass] = js.native
  val defaultOptions: Options = js.native
  val lineBreak: stdLib.RegExp = js.native
  val lineBreakG: stdLib.RegExp = js.native
  val parse: IParse = js.native
  var parse_dammit: js.UndefOr[IParse] = js.native
  val plugins: PluginsObject = js.native
  var pluginsLoose: js.UndefOr[PluginsObject] = js.native
  val version: java.lang.String = js.native
  def addLooseExports(parse: IParse, parser: ILooseParserClass, plugins: PluginsObject): scala.Unit = js.native
  def getLineInfo(input: java.lang.String, offset: scala.Double): estreeLib.estreeMod.Position = js.native
  def isIdentifierChar(code: scala.Double): scala.Boolean = js.native
  def isIdentifierChar(code: scala.Double, astral: scala.Boolean): scala.Boolean = js.native
  def isIdentifierStart(code: scala.Double): scala.Boolean = js.native
  def isIdentifierStart(code: scala.Double, astral: scala.Boolean): scala.Boolean = js.native
  def isNewLine(code: scala.Double): scala.Boolean = js.native
  def parseExpressionAt(input: java.lang.String): estreeLib.Expression = js.native
  def parseExpressionAt(input: java.lang.String, pos: scala.Double): estreeLib.Expression = js.native
  def parseExpressionAt(input: java.lang.String, pos: scala.Double, options: Options): estreeLib.Expression = js.native
  def tokenizer(input: java.lang.String, options: Options): ITokenizer = js.native
}

