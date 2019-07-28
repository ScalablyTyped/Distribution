package typings.acorn.acornMod

import typings.estree.estreeMod.Expression
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LooseParser: js.UndefOr[ILooseParserClass] = js.native
  val defaultOptions: Options = js.native
  val lineBreak: RegExp = js.native
  val lineBreakG: RegExp = js.native
  val parse: IParse = js.native
  var parse_dammit: js.UndefOr[IParse] = js.native
  val plugins: PluginsObject = js.native
  var pluginsLoose: js.UndefOr[PluginsObject] = js.native
  val version: String = js.native
  def addLooseExports(parse: IParse, parser: ILooseParserClass, plugins: PluginsObject): Unit = js.native
  def getLineInfo(input: String, offset: Double): typings.estree.estreeMod.Position = js.native
  def isIdentifierChar(code: Double): Boolean = js.native
  def isIdentifierChar(code: Double, astral: Boolean): Boolean = js.native
  def isIdentifierStart(code: Double): Boolean = js.native
  def isIdentifierStart(code: Double, astral: Boolean): Boolean = js.native
  def isNewLine(code: Double): Boolean = js.native
  def parseExpressionAt(input: String): Expression = js.native
  def parseExpressionAt(input: String, pos: Double): Expression = js.native
  def parseExpressionAt(input: String, pos: Double, options: Options): Expression = js.native
  def tokenizer(input: String, options: Options): ITokenizer = js.native
}

