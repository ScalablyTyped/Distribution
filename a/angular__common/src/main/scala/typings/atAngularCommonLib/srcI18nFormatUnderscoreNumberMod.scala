package typings
package atAngularCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/i18n/format_number", JSImport.Namespace)
@js.native
object srcI18nFormatUnderscoreNumberMod extends js.Object {
  val NUMBER_FORMAT_REGEXP: stdLib.RegExp = js.native
  def formatCurrency(value: scala.Double, locale: java.lang.String, currency: java.lang.String): java.lang.String = js.native
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String
  ): java.lang.String = js.native
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String,
    digitsInfo: java.lang.String
  ): java.lang.String = js.native
  def formatNumber(value: scala.Double, locale: java.lang.String): java.lang.String = js.native
  def formatNumber(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = js.native
  def formatPercent(value: scala.Double, locale: java.lang.String): java.lang.String = js.native
  def formatPercent(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = js.native
  def parseIntAutoRadix(text: java.lang.String): scala.Double = js.native
}

