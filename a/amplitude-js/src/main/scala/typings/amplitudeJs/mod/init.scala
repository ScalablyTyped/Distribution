package typings.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amplitude-js", "init")
@js.native
object init extends js.Object {
  
  def apply(apiKey: String): Unit = js.native
  def apply(
    apiKey: String,
    userId: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  def apply(apiKey: String, userId: js.UndefOr[scala.Nothing], options: Config): Unit = js.native
  def apply(
    apiKey: String,
    userId: js.UndefOr[scala.Nothing],
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  def apply(apiKey: String, userId: String): Unit = js.native
  def apply(
    apiKey: String,
    userId: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  def apply(apiKey: String, userId: String, options: Config): Unit = js.native
  def apply(
    apiKey: String,
    userId: String,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
}
