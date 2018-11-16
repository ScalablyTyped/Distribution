package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "AccessScope")
@js.native
class AccessScope protected () extends Expression {
  def this(name: java.lang.String, ancestor: scala.Double) = this()
  /**
     * The number of hops up the scope tree.
     */
  var ancestor: scala.Double = js.native
  /**
     * The property name.
     */
  var name: java.lang.String = js.native
}

