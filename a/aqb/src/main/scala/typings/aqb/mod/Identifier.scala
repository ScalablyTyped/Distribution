package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier
  extends StObject
     with Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  
  var _value: String = js.native
  
  def toAQL(): String = js.native
}
