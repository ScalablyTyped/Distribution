package typings.ajv

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCopy extends js.Object {
  def copy(obj: js.Any): js.Any = js.native
  def copy(obj: js.Any, target: js.Any): js.Any = js.native
  def equal(obj: js.Any, target: js.Any): Boolean = js.native
  def escapeFragment(str: String): String = js.native
  def escapeJsonPointer(str: String): String = js.native
  def escapeQuotes(str: String): String = js.native
  def getData(jsonPointer: String, dataLevel: Double, paths: js.Array[String]): String = js.native
  def getProperty(str: String): String = js.native
  def schemaHasRules(schema: js.Object, rules: js.Any): String = js.native
  def toHash(source: js.Array[String]): StringDictionary[js.UndefOr[`true`]] = js.native
  def toQuotedString(str: String): String = js.native
  def unescapeFragment(str: String): String = js.native
  def unescapeJsonPointer(str: String): String = js.native
}

