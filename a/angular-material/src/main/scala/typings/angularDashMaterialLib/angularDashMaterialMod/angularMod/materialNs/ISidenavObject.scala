package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISidenavObject extends js.Object {
  def close(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def isLockedOpen(): scala.Boolean
  def isOpen(): scala.Boolean
  def onClose(onClose: js.Function0[scala.Unit]): scala.Unit
  def open(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def toggle(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
}

