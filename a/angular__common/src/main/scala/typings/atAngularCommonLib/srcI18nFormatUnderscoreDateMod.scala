package typings
package atAngularCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/i18n/format_date", JSImport.Namespace)
@js.native
object srcI18nFormatUnderscoreDateMod extends js.Object {
  val ISO8601_DATE_REGEX: stdLib.RegExp = js.native
  def formatDate(value: java.lang.String, format: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatDate(
    value: java.lang.String,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = js.native
  def formatDate(value: scala.Double, format: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatDate(
    value: scala.Double,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = js.native
  def formatDate(value: stdLib.Date, format: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatDate(value: stdLib.Date, format: java.lang.String, locale: java.lang.String, timezone: java.lang.String): java.lang.String = js.native
  def isDate(value: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isoStringToDate(`match`: stdLib.RegExpMatchArray): stdLib.Date = js.native
  def toDate(value: java.lang.String): stdLib.Date = js.native
  def toDate(value: scala.Double): stdLib.Date = js.native
  def toDate(value: stdLib.Date): stdLib.Date = js.native
}

