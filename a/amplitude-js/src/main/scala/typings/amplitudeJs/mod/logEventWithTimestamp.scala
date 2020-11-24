package typings.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amplitude-js", "logEventWithTimestamp")
@js.native
object logEventWithTimestamp extends js.Object {
  
  def apply(event: String): LogReturn = js.native
  def apply(
    event: String,
    data: js.UndefOr[scala.Nothing],
    timestamp: js.UndefOr[scala.Nothing],
    callback: Callback
  ): LogReturn = js.native
  def apply(event: String, data: js.UndefOr[scala.Nothing], timestamp: Double): LogReturn = js.native
  def apply(event: String, data: js.UndefOr[scala.Nothing], timestamp: Double, callback: Callback): LogReturn = js.native
  def apply(event: String, data: js.Any): LogReturn = js.native
  def apply(event: String, data: js.Any, timestamp: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
  def apply(event: String, data: js.Any, timestamp: Double): LogReturn = js.native
  def apply(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = js.native
}
