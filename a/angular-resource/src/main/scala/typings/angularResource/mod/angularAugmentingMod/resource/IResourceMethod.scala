package typings.angularResource.mod.angularAugmentingMod.resource

import typings.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow specify more resource methods
// No need to add duplicates for all four overloads.
@js.native
trait IResourceMethod[T] extends js.Object {
  def apply(): T = js.native
  def apply(params: js.Object): T = js.native
  def apply(params: js.Object, data: js.Object): T = js.native
  def apply(params: js.Object, data: js.Object, success: Function): T = js.native
  def apply(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
  def apply(params: js.Object, success: Function): T = js.native
  def apply(params: js.Object, success: Function, error: Function): T = js.native
  def apply(success: Function): T = js.native
  def apply(success: Function, error: Function): T = js.native
}

