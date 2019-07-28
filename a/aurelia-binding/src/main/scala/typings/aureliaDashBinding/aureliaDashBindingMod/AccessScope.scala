package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "AccessScope")
@js.native
class AccessScope protected () extends Expression {
  def this(name: String, ancestor: Double) = this()
  /**
    * The number of hops up the scope tree.
    */
  var ancestor: Double = js.native
  /**
    * The property name.
    */
  var name: String = js.native
}

