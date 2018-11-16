package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Really just a regular Array object with $promise and $resolve attached to it
         */
@js.native
trait IResourceArray[T]
  extends stdLib.Array[T with IResource[T]] {
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$resolved")
  var $resolved: scala.Boolean = js.native
  @JSName("$cancelRequest")
  def $cancelRequest(): scala.Unit = js.native
}

