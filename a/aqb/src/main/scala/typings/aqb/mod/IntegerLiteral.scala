package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerLiteral
  extends Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  
  var _value: Double = js.native
  
  def toAQL(): String = js.native
}
