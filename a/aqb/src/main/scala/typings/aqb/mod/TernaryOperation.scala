package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TernaryOperation
  extends Operation
     with Instantiable5[
      /* operator1 */ String, 
      /* operator2 */ String, 
      /* value1 */ Expression, 
      /* value2 */ js.Any, 
      /* value3 */ js.Any, 
      Operation
    ] {
  var _operator1: String = js.native
  var _operator2: String = js.native
  def toAQL(): String = js.native
}

