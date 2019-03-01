package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var block: scala.Boolean
  var ghost: scala.Boolean
  var loading: scala.Boolean
}

object Anon_Block {
  @scala.inline
  def apply(block: scala.Boolean, ghost: scala.Boolean, loading: scala.Boolean): Anon_Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("ghost")(ghost)
    __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[Anon_Block]
  }
}

