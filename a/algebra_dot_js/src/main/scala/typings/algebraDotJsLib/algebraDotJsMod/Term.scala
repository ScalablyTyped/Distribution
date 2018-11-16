package typings
package algebraDotJsLib.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Term extends js.Object {
  var coefficients: js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction]
  var variables: js.Array[Variable]
  def coefficient(): algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction
}

