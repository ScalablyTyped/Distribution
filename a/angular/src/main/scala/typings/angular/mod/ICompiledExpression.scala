package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompiledExpression extends StObject {
  
  def apply(context: js.Any): js.Any = js.native
  def apply(context: js.Any, locals: js.Any): js.Any = js.native
  
  // If value is not provided, undefined is gonna be used since the implementation
  // does not check the parameter. Let's force a value for consistency. If consumer
  // whants to undefine it, pass the undefined value explicitly.
  def assign(context: js.Any, value: js.Any): js.Any = js.native
  
  var constant: Boolean = js.native
  
  var literal: Boolean = js.native
}
