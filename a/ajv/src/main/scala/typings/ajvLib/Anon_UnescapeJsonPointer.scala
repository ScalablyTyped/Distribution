package typings
package ajvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_UnescapeJsonPointer extends js.Object {
  def copy(obj: js.Any): js.Any = js.native
  def copy(obj: js.Any, target: js.Any): js.Any = js.native
  def equal(obj: js.Any, target: js.Any): scala.Boolean = js.native
  def escapeFragment(str: java.lang.String): java.lang.String = js.native
  def escapeJsonPointer(str: java.lang.String): java.lang.String = js.native
  def escapeQuotes(str: java.lang.String): java.lang.String = js.native
  def getData(jsonPointer: java.lang.String, dataLevel: scala.Double, paths: js.Array[java.lang.String]): java.lang.String = js.native
  def getProperty(str: java.lang.String): java.lang.String = js.native
  def schemaHasRules(schema: js.Object, rules: js.Any): java.lang.String = js.native
  def toHash(source: js.Array[java.lang.String]): ScalablyTyped.runtime.StringDictionary[js.UndefOr[ajvLib.ajvLibNumbers.`true`]] = js.native
  def toQuotedString(str: java.lang.String): java.lang.String = js.native
  def unescapeFragment(str: java.lang.String): java.lang.String = js.native
  def unescapeJsonPointer(str: java.lang.String): java.lang.String = js.native
}

