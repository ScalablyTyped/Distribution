package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Really just a regular Array object with $promise and $resolve attached to it
     */
@js.native
trait IResourceArray[T]
  extends stdLib.Array[T] {
  /** the promise of the original server interaction that created this collection. **/
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$resolved")
  var $resolved: scala.Boolean = js.native
}

