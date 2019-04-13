package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelRef extends js.Object {
  var config: IPanelConfig = js.native
  var id: java.lang.String = js.native
  var isAttached: scala.Boolean = js.native
  var panelContainer: angularLib.JQuery = js.native
  var panelEl: angularLib.JQuery = js.native
  def addClass(newClass: java.lang.String): scala.Unit = js.native
  def attach(): angularLib.angularMod.IPromise[_] = js.native
  def close(): angularLib.angularMod.IPromise[_] = js.native
  def destroy(): scala.Unit = js.native
  def detach(): angularLib.angularMod.IPromise[_] = js.native
  def hide(): angularLib.angularMod.IPromise[_] = js.native
  def open(): angularLib.angularMod.IPromise[_] = js.native
  def registerInterceptor(`type`: java.lang.String, callback: js.Function0[angularLib.angularMod.IPromise[_]]): IPanelRef = js.native
  def removeAllInterceptors(): IPanelRef = js.native
  def removeAllInterceptors(`type`: java.lang.String): IPanelRef = js.native
  def removeClass(oldClass: java.lang.String): scala.Unit = js.native
  def removeInterceptor(`type`: java.lang.String, callback: js.Function0[angularLib.angularMod.IPromise[_]]): IPanelRef = js.native
  def show(): angularLib.angularMod.IPromise[_] = js.native
  def toggleClass(toggleClass: java.lang.String): scala.Unit = js.native
  def updatePosition(position: IPanelPosition): scala.Unit = js.native
}

