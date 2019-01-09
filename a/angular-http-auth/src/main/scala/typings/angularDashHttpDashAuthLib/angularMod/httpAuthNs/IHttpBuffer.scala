package typings
package angularDashHttpDashAuthLib.angularMod.httpAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpBuffer extends js.Object {
  def append(
    config: angularLib.angularMod.angularNs.IRequestConfig,
    deferred: angularDashHttpDashAuthLib.Anon_Data
  ): scala.Unit = js.native
  def rejectAll(): scala.Unit = js.native
  def rejectAll(reason: js.Any): scala.Unit = js.native
  def retryAll(): scala.Unit = js.native
  def retryAll(updater: angularLib.angularMod.Global.Function): scala.Unit = js.native
}

