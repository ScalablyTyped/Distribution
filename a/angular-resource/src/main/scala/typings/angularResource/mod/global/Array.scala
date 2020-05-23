package typings.angularResource.mod.global

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: IPromise[Array[T]]
  @JSName("$resolved")
  var $resolved: Boolean
}

object Array {
  @scala.inline
  def apply[T]($promise: IPromise[Array[T]], $resolved: Boolean): Array[T] = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], $resolved = $resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
}

