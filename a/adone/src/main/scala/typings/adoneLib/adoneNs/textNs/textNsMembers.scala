package typings
package adoneLib.adoneNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.text")
@js.native
object textNsMembers extends js.Object {
  val endLineRegExp: stdLib.RegExp = js.native
  def camelCaseToDashed(str: java.lang.String): java.lang.String = js.native
  def capitalize(str: java.lang.String): java.lang.String = js.native
  def capitalizeWords(str: java.lang.String): java.lang.String = js.native
  def detectNewLine(str: java.lang.String): adoneLib.adoneLibStrings.BACKSLASHrBACKSLASHn | adoneLib.adoneLibStrings.BACKSLASHn = js.native
  def escapeStringRegexp(str: java.lang.String): java.lang.String = js.native
  def hasAnsi(str: java.lang.String): scala.Boolean = js.native
  def indent(string: java.lang.String, spaces: scala.Double): java.lang.String = js.native
  def random(len: scala.Double): java.lang.String = js.native
  def regExpIndexOf(str: java.lang.String, regex: stdLib.RegExp): java.lang.String = js.native
  def regExpIndexOf(str: java.lang.String, regex: stdLib.RegExp, index: scala.Double): java.lang.String = js.native
  def splitLines(str: java.lang.String): js.Array[java.lang.String] = js.native
  def stringDistance(strA: java.lang.String, strB: java.lang.String): scala.Double = js.native
  def stringDistance(strA: java.lang.String, strB: java.lang.String, memo: js.Array[js.Array[scala.Double]]): scala.Double = js.native
  def stringDistanceCapped(strA: java.lang.String, strB: java.lang.String, cap: scala.Double): scala.Double = js.native
  def stripAnsi(str: java.lang.String): java.lang.String = js.native
  def stripBOM(str: java.lang.String): java.lang.String = js.native
  def stripEof(str: java.lang.String): java.lang.String = js.native
  def stripLastCRLF(str: java.lang.String): java.lang.String = js.native
  def toCamelCase(str: java.lang.String): java.lang.String = js.native
  def toUTF8Array(str: java.lang.String): js.Array[scala.Double] = js.native
  def width(str: java.lang.String): scala.Double = js.native
  def wordwrap(str: java.lang.String, stop: scala.Double): java.lang.String = js.native
  def wordwrap(
    str: java.lang.String,
    stop: scala.Double,
    options: adoneLib.adoneNs.textNs.INs.WordWrapOptions with adoneLib.Anon_FalseJoin
  ): js.Array[java.lang.String] = js.native
  @JSName("wordwrap")
  def wordwrap_String(str: java.lang.String, stop: scala.Double, options: adoneLib.adoneNs.textNs.INs.WordWrapOptions): java.lang.String = js.native
}

