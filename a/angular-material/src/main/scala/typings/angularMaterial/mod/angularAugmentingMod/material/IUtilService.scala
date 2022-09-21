package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilService extends StObject {
  
  // tslint:disable-next-line:ban-types debounce takes in a user provided function
  def debounce[T /* <: Function */](func: T): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double, scope: Any): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double, scope: Any, invokeApply: Boolean): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Double, scope: Unit, invokeApply: Boolean): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Unit, scope: Any): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Unit, scope: Any, invokeApply: Boolean): T = js.native
  def debounce[T /* <: Function */](func: T, wait: Unit, scope: Unit, invokeApply: Boolean): T = js.native
  
  def enableScrolling(): Unit = js.native
}
