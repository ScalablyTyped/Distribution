package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.JQueryEventObject
import typings.angular.mod.IPromise
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuService extends StObject {
  
  def close(): Unit = js.native
  
  def hide(): IPromise[js.Any] = js.native
  def hide(response: js.Any): IPromise[js.Any] = js.native
  def hide(response: js.Any, options: js.Any): IPromise[js.Any] = js.native
  def hide(response: Unit, options: js.Any): IPromise[js.Any] = js.native
  
  def open(): Unit = js.native
  def open(event: JQueryEventObject): Unit = js.native
  def open(event: MouseEvent): Unit = js.native
}
