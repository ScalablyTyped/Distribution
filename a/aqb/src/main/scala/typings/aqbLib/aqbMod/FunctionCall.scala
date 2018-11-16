package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCall
  extends Expression
     with ScalablyTyped.runtime.Instantiable2[/* functionName */ java.lang.String, /* args (repeated) */ js.Any, Expression] {
  var _args: js.Array[_] = js.native
  var _functionName: java.lang.String = js.native
  var _re: stdLib.RegExp = js.native
  def toAQL(): java.lang.String = js.native
}

