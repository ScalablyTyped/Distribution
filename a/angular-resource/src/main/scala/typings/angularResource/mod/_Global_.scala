package typings.angularResource.mod

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait Array[T] extends js.Object {
    /** The promise of the original server interaction that created this collection. */
    @JSName("$promise")
    var $promise: IPromise[Array[T]] = js.native
    @JSName("$resolved")
    var $resolved: Boolean = js.native
  }
  
}

