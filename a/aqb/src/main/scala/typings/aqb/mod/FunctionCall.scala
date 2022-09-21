package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionCall
  extends StObject
     with Expression
     with Instantiable2[/* functionName */ String, /* args (repeated) */ Any, Expression] {
  
  var _args: js.Array[Any] = js.native
  
  var _functionName: String = js.native
  
  var _re: js.RegExp = js.native
  
  def toAQL(): String = js.native
}
