package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NAryOperation
  extends Operation
     with Instantiable2[/* operator */ String, /* values */ js.Array[js.Any], Operation] {
  
  var _operator: String = js.native
  
  var _values: js.Array[Expression] = js.native
  
  def toAQL(): String = js.native
}
