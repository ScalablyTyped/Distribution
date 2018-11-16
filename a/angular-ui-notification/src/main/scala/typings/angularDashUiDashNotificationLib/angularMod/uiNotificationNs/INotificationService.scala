package typings
package angularDashUiDashNotificationLib.angularMod.uiNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationService extends js.Object {
  def apply(message: Message): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
  def apply(message: Message, `type`: MessageType): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
  def clearAll(): scala.Unit = js.native
  def error(message: Message): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
  def info(message: Message): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
  def primary(message: Message): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
  def success(message: Message): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
  def warning(message: Message): angularLib.angularMod.angularNs.IPromise[INotificationScope] = js.native
}

