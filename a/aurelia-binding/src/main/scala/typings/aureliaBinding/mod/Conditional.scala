package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "Conditional")
@js.native
open class Conditional protected () extends Expression {
  def this(condition: Expression, yes: Expression, no: Expression) = this()
  
  var condition: Expression = js.native
  
  var no: Expression = js.native
  
  var yes: Expression = js.native
}
