package typings.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", "logEventWithGroups")
@js.native
object logEventWithGroups extends js.Object {
  def apply(event: String): LogReturn = js.native
  def apply(
    event: String,
    data: js.UndefOr[scala.Nothing],
    groups: js.UndefOr[scala.Nothing],
    callback: Callback
  ): LogReturn = js.native
  def apply(event: String, data: js.UndefOr[scala.Nothing], groups: js.Any): LogReturn = js.native
  def apply(event: String, data: js.UndefOr[scala.Nothing], groups: js.Any, callback: Callback): LogReturn = js.native
  def apply(event: String, data: js.Any): LogReturn = js.native
  def apply(event: String, data: js.Any, groups: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
  def apply(event: String, data: js.Any, groups: js.Any): LogReturn = js.native
  def apply(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = js.native
}

