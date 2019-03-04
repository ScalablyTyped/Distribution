package typings
package angularDashResourceLib.angularDashResourceMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[Array[T]]
  @JSName("$resolved")
  var $resolved: scala.Boolean
}

object Array {
  @scala.inline
  def apply[T]($promise: angularLib.angularMod.angularNs.IPromise[Array[T]], $resolved: scala.Boolean): Array[T] = {
    val __obj = js.Dynamic.literal($promise = $promise, $resolved = $resolved)
  
    __obj.asInstanceOf[Array[T]]
  }
}

