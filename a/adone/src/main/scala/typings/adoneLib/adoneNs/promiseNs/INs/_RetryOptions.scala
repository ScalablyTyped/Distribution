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

