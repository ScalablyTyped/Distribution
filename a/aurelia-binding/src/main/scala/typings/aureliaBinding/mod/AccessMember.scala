package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "AccessMember")
@js.native
class AccessMember protected () extends Expression {
  def this(`object`: Expression, name: String) = this()
  
  /**
    * The property name.
    */
  var name: String = js.native
  
  /**
    * The object expression.
    */
  var `object`: Expression = js.native
}
