package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExpression
  extends PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* offset */ js.Any, PartialStatement]
     with Instantiable3[/* prev */ PartialStatement, /* offset */ js.Any, /* count */ js.Any, PartialStatement] {
  def toAQL(): String = js.native
}

