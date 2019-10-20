package typings.arrayDotFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array.from/polyfill", JSImport.Namespace)
@js.native
object polyfillMod extends js.Object {
  /**
    * Gets the optimal `Array.from` implementation to use.
    */
  def apply(): Fn_ArrayLike = js.native
}

