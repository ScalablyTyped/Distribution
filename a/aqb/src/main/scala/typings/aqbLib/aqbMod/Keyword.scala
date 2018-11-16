package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyword
  extends Expression
     with ScalablyTyped.runtime.Instantiable1[/* value */ js.Any, Expression] {
  var _value: java.lang.String = js.native
  var re: stdLib.RegExp = js.native
  def toAQL(): java.lang.String = js.native
}

