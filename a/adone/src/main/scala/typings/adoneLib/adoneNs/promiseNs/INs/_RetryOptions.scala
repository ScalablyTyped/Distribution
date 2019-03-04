package typings
package adoneLib.adoneNs.promiseNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RetryOptions extends js.Object {
  var backOffBase: scala.Double
  var backOffExponent: scala.Double
  var `match`: java.lang.String | stdLib.RegExp | nodeLib.Error | (js.Array[java.lang.String | stdLib.RegExp | nodeLib.Error])
  var max: scala.Double
  var name: java.lang.String
  var timeout: scala.Double
  def report(message: java.lang.String, options: _RetryOptions, err: js.Any): scala.Unit
}

object _RetryOptions {
  @scala.inline
  def apply(
    backOffBase: scala.Double,
    backOffExponent: scala.Double,
    `match`: java.lang.String | stdLib.RegExp | nodeLib.Error | (js.Array[java.lang.String | stdLib.RegExp | nodeLib.Error]),
    max: scala.Double,
    name: java.lang.String,
    report: js.Function3[java.lang.String, _RetryOptions, js.Any, scala.Unit],
    timeout: scala.Double
  ): _RetryOptions = {
    val __obj = js.Dynamic.literal(backOffBase = backOffBase, backOffExponent = backOffExponent, max = max, name = name, report = report, timeout = timeout)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RetryOptions]
  }
}

