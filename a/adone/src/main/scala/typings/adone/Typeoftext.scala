package typings.adone

import typings.adone.adoneNs.textNs.INs.WordWrapOptions
import typings.adone.adoneStrings.BACKSLASHn
import typings.adone.adoneStrings.BACKSLASHrBACKSLASHn
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftext extends js.Object {
  val INs: js.Any = js.native
  val endLineRegExp: RegExp = js.native
  val escapeNs: Typeofescape = js.native
  val regexpNs: Typeofregexp = js.native
  val spinnerNs: Typeofspinner = js.native
  val tableNs: Typeoftable = js.native
  val unicodeNs: Typeofunicode = js.native
  def camelCaseToDashed(str: String): String = js.native
  def capitalize(str: String): String = js.native
  def capitalizeWords(str: String): String = js.native
  def detectNewLine(str: String): BACKSLASHrBACKSLASHn | BACKSLASHn = js.native
  def escapeStringRegexp(str: String): String = js.native
  def hasAnsi(str: String): Boolean = js.native
  def indent(string: String, spaces: Double): String = js.native
  def random(len: Double): String = js.native
  def regExpIndexOf(str: String, regex: RegExp): String = js.native
  def regExpIndexOf(str: String, regex: RegExp, index: Double): String = js.native
  def splitLines(str: String): js.Array[String] = js.native
  def stringDistance(strA: String, strB: String): Double = js.native
  def stringDistance(strA: String, strB: String, memo: js.Array[js.Array[Double]]): Double = js.native
  def stringDistanceCapped(strA: String, strB: String, cap: Double): Double = js.native
  def stripAnsi(str: String): String = js.native
  def stripBOM(str: String): String = js.native
  def stripEof(str: String): String = js.native
  def stripLastCRLF(str: String): String = js.native
  def toCamelCase(str: String): String = js.native
  def toUTF8Array(str: String): js.Array[Double] = js.native
  def width(str: String): Double = js.native
  def wordwrap(str: String, stop: Double): String = js.native
  def wordwrap(str: String, stop: Double, options: WordWrapOptions with Anon_FalseJoin): js.Array[String] = js.native
  @JSName("wordwrap")
  def wordwrap_String(str: String, stop: Double, options: WordWrapOptions): String = js.native
}

