package typings.angularDashResource.angularDashResourceMod.angularMod.resourceNs

import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow specify resource moethod which returns the array
// No need to add duplicates for all four overloads.
@js.native
trait IResourceArrayMethod[T] extends js.Object {
  def apply(): IResourceArray[T] = js.native
  def apply(params: js.Object): IResourceArray[T] = js.native
  def apply(params: js.Object, data: js.Object): IResourceArray[T] = js.native
  def apply(params: js.Object, data: js.Object, success: Function): IResourceArray[T] = js.native
  def apply(params: js.Object, data: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
  def apply(params: js.Object, success: Function): IResourceArray[T] = js.native
  def apply(params: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
  def apply(success: Function): IResourceArray[T] = js.native
  def apply(success: Function, error: Function): IResourceArray[T] = js.native
}

