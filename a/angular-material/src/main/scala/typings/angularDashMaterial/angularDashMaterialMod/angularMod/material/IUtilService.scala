package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import typings.angular.angularMod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilService extends js.Object {
  // tslint:disable-next-line:ban-types debounce takes in a user provided function
  def debounce[T /* <: Function */](func: T): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double, scope: js.Any): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double, scope: js.Any, invokeApply: Boolean): T = js.native
  def enableScrolling(): Unit = js.native
}

