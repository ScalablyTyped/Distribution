package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeExpression
  extends Expression
     with ScalablyTyped.runtime.Instantiable1[/* start */ js.Any, Expression]
     with ScalablyTyped.runtime.Instantiable2[/* start */ js.Any, /* end */ js.Any, Expression] {
  var _end: scala.Double = js.native
  var _start: scala.Double = js.native
  var re: stdLib.RegExp = js.native
  def toAQL(): java.lang.String = js.native
}

