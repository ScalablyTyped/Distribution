package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "LiteralString")
@js.native
class LiteralString protected () extends Expression {
  def this(value: String) = this()
  
  var value: String = js.native
}
