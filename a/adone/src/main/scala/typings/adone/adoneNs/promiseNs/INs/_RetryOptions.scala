package typings.adone.adoneNs.promiseNs.INs

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RetryOptions extends js.Object {
  var backOffBase: Double
  var backOffExponent: Double
  var `match`: String | RegExp | Error | (js.Array[String | RegExp | Error])
  var max: Double
  var name: String
  var timeout: Double
  def report(message: String, options: _RetryOptions, err: js.Any): Unit
}

object _RetryOptions {
  @scala.inline
  def apply(
    backOffBase: Double,
    backOffExponent: Double,
    `match`: String | RegExp | Error | (js.Array[String | RegExp | Error]),
    max: Double,
    name: String,
    report: (String, _RetryOptions, js.Any) => Unit,
    timeout: Double
  ): _RetryOptions = {
    val __obj = js.Dynamic.literal(backOffBase = backOffBase, backOffExponent = backOffExponent, max = max, name = name, report = js.Any.fromFunction3(report), timeout = timeout)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RetryOptions]
  }
}

