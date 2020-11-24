package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "Unparser")
@js.native
class Unparser protected () extends ExpressionVisitor {
  def this(buffer: js.Array[String]) = this()
}
