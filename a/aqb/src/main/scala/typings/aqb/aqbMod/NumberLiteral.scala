package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLiteral
  extends Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  var re: RegExp = js.native
  def toAQL(): String = js.native
}

