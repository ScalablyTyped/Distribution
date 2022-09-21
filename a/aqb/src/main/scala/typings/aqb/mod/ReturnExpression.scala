package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnExpression
  extends StObject
     with Expression
     with Instantiable3[/* prev */ LetExpression, /* value */ Any, /* distinct */ Boolean, Expression] {
  
  var _distinct: Boolean = js.native
  
  var _prev: LetExpression = js.native
  
  def toAQL(): String = js.native
}
