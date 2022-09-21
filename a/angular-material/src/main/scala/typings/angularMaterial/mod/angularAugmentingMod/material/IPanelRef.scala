package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.JQuery
import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelRef extends StObject {
  
  def addClass(newClass: String): Unit = js.native
  
  def attach(): IPromise[Any] = js.native
  
  def close(): IPromise[Any] = js.native
  
  var config: IPanelConfig = js.native
  
  def destroy(): Unit = js.native
  
  def detach(): IPromise[Any] = js.native
  
  def hide(): IPromise[Any] = js.native
  
  var id: String = js.native
  
  var isAttached: Boolean = js.native
  
  def open(): IPromise[Any] = js.native
  
  var panelContainer: JQuery = js.native
  
  var panelEl: JQuery = js.native
  
  def registerInterceptor(`type`: String, callback: js.Function0[IPromise[Any]]): IPanelRef = js.native
  
  def removeAllInterceptors(): IPanelRef = js.native
  def removeAllInterceptors(`type`: String): IPanelRef = js.native
  
  def removeClass(oldClass: String): Unit = js.native
  
  def removeInterceptor(`type`: String, callback: js.Function0[IPromise[Any]]): IPanelRef = js.native
  
  def show(): IPromise[Any] = js.native
  
  def toggleClass(toggleClass: String): Unit = js.native
  
  def updateAnimation(animation: IPanelAnimation): Unit = js.native
  
  def updatePosition(position: IPanelPosition): Unit = js.native
}
