package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLiteral
  extends StObject
     with Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  
  var _value: js.Object = js.native
  
  def toAQL(): String = js.native
}
