package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanLiteral
  extends Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  var _value: Boolean = js.native
  def toAQL(): String = js.native
}

