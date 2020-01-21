package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterExpression
  extends PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* expr */ js.Any, PartialStatement] {
  def toAQL(): String = js.native
}

