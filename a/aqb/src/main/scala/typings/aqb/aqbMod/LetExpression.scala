package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetExpression
  extends PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* dfns (repeated) */ js.Any, PartialStatement] {
  var _dfns: Definitions = js.native
  var _prev: PartialStatement = js.native
  def toAQL(): String = js.native
}

