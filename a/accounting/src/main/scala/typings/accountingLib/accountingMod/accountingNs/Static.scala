package typings
package accountingLib.accountingMod.accountingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  // settings object that controls default parameters for library methods
  var settings: Settings = js.native
  // format a list of values for column-display
  def formatColumn(numbers: js.Array[js.Array[scala.Double] | scala.Double]): js.Array[java.lang.String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[scala.Double] | scala.Double],
    options: CurrencySettings[CurrencyFormat | java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def formatColumn(numbers: js.Array[js.Array[scala.Double] | scala.Double], symbol: java.lang.String): js.Array[java.lang.String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[scala.Double] | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double
  ): js.Array[java.lang.String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[scala.Double] | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[scala.Double] | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[scala.Double] | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String,
    format: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def formatMoney(number: java.lang.String): java.lang.String = js.native
  def formatMoney(number: java.lang.String, options: CurrencySettings[CurrencyFormat | java.lang.String]): java.lang.String = js.native
  def formatMoney(number: java.lang.String, symbol: java.lang.String): java.lang.String = js.native
  def formatMoney(number: java.lang.String, symbol: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def formatMoney(
    number: java.lang.String,
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String
  ): java.lang.String = js.native
  def formatMoney(
    number: java.lang.String,
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String
  ): java.lang.String = js.native
  def formatMoney(
    number: java.lang.String,
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String,
    format: java.lang.String
  ): java.lang.String = js.native
  // format any number or stringified number into currency
  def formatMoney(number: scala.Double): java.lang.String = js.native
  def formatMoney(number: scala.Double, options: CurrencySettings[CurrencyFormat | java.lang.String]): java.lang.String = js.native
  def formatMoney(number: scala.Double, symbol: java.lang.String): java.lang.String = js.native
  def formatMoney(number: scala.Double, symbol: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def formatMoney(
    number: scala.Double,
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String
  ): java.lang.String = js.native
  def formatMoney(
    number: scala.Double,
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String
  ): java.lang.String = js.native
  def formatMoney(
    number: scala.Double,
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String,
    format: java.lang.String
  ): java.lang.String = js.native
  // generic case (any array of numbers)
  def formatMoney(numbers: js.Array[_ | scala.Double]): js.Array[java.lang.String] = js.native
  def formatMoney(numbers: js.Array[_ | scala.Double], options: CurrencySettings[CurrencyFormat | java.lang.String]): js.Array[java.lang.String] = js.native
  def formatMoney(numbers: js.Array[_ | scala.Double], symbol: java.lang.String): js.Array[java.lang.String] = js.native
  def formatMoney(numbers: js.Array[_ | scala.Double], symbol: java.lang.String, precision: scala.Double): js.Array[java.lang.String] = js.native
  def formatMoney(
    numbers: js.Array[_ | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def formatMoney(
    numbers: js.Array[_ | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def formatMoney(
    numbers: js.Array[_ | scala.Double],
    symbol: java.lang.String,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String,
    format: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def formatNumber(number: js.Array[_ | scala.Double]): js.Array[java.lang.String] = js.native
  def formatNumber(number: js.Array[_ | scala.Double], options: NumberSettings): js.Array[java.lang.String] = js.native
  def formatNumber(number: js.Array[_ | scala.Double], precision: scala.Double): js.Array[java.lang.String] = js.native
  def formatNumber(number: js.Array[_ | scala.Double], precision: scala.Double, thousand: java.lang.String): js.Array[java.lang.String] = js.native
  def formatNumber(
    number: js.Array[_ | scala.Double],
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String
  ): js.Array[java.lang.String] = js.native
  // format a number with custom precision and localisation
  def formatNumber(number: scala.Double): java.lang.String = js.native
  def formatNumber(number: scala.Double, options: NumberSettings): java.lang.String = js.native
  def formatNumber(number: scala.Double, precision: scala.Double): java.lang.String = js.native
  def formatNumber(number: scala.Double, precision: scala.Double, thousand: java.lang.String): java.lang.String = js.native
  def formatNumber(
    number: scala.Double,
    precision: scala.Double,
    thousand: java.lang.String,
    decimal: java.lang.String
  ): java.lang.String = js.native
  // better rounding for floating point numbers
  def toFixed(number: scala.Double): java.lang.String = js.native
  def toFixed(number: scala.Double, precision: scala.Double): java.lang.String = js.native
  // get a value from any formatted number/currency string
  def unformat(string: java.lang.String): scala.Double = js.native
  def unformat(string: java.lang.String, decimal: java.lang.String): scala.Double = js.native
}

