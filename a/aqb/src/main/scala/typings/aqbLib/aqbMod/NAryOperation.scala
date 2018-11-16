package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NAryOperation
  extends Operation
     with ScalablyTyped.runtime.Instantiable2[/* operator */ java.lang.String, /* values */ js.Array[js.Any], Operation] {
  var _operator: java.lang.String = js.native
  var _values: js.Array[Expression] = js.native
  def toAQL(): java.lang.String = js.native
}

