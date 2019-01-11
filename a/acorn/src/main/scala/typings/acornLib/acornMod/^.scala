package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LooseParser: js.UndefOr[acornLib.acornMod.acornNs.ILooseParserClass] = js.native
  val defaultOptions: acornLib.acornMod.acornNs.Options = js.native
  val lineBreak: stdLib.RegExp = js.native
  val lineBreakG: stdLib.RegExp = js.native
  val parse: acornLib.acornMod.acornNs.IParse = js.native
  var parse_dammit: js.UndefOr[acornLib.acornMod.acornNs.IParse] = js.native
  val plugins: acornLib.acornMod.acornNs.PluginsObject = js.native
  var pluginsLoose: js.UndefOr[acornLib.acornMod.acornNs.PluginsObject] = js.native
  val tokContexts: acornLib.Anon_Bexpr = js.native
  val tokTypes: acornLib.Anon_Arrow = js.native
  val version: java.lang.String = js.native
  def addLooseExports(
    parse: acornLib.acornMod.acornNs.IParse,
    parser: acornLib.acornMod.acornNs.ILooseParserClass,
    plugins: acornLib.acornMod.acornNs.PluginsObject
  ): scala.Unit = js.native
  def getLineInfo(input: java.lang.String, offset: scala.Double): estreeLib.estreeMod.Position = js.native
  def isIdentifierChar(code: scala.Double): scala.Boolean = js.native
  def isIdentifierChar(code: scala.Double, astral: scala.Boolean): scala.Boolean = js.native
  def isIdentifierStart(code: scala.Double): scala.Boolean = js.native
  def isIdentifierStart(code: scala.Double, astral: scala.Boolean): scala.Boolean = js.native
  def isNewLine(code: scala.Double): scala.Boolean = js.native
  def parseExpressionAt(input: java.lang.String): estreeLib.Expression = js.native
  def parseExpressionAt(input: java.lang.String, pos: scala.Double): estreeLib.Expression = js.native
  def parseExpressionAt(input: java.lang.String, pos: scala.Double, options: acornLib.acornMod.acornNs.Options): estreeLib.Expression = js.native
  def tokenizer(input: java.lang.String, options: acornLib.acornMod.acornNs.Options): acornLib.acornMod.acornNs.ITokenizer = js.native
}

