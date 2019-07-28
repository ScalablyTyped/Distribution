package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortExpression
  extends PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* args (repeated) */ js.Any, PartialStatement] {
  var _args: js.Array[Keyword] = js.native
  var keywords: js.Array[String] = js.native
  def toAQL(): String = js.native
}

