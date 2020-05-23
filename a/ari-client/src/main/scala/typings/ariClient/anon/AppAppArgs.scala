package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAppArgs extends js.Object {
  var app: String
  var appArgs: js.UndefOr[String] = js.undefined
  var channelId: String
}

object AppAppArgs {
  @scala.inline
  def apply(app: String, channelId: String, appArgs: String = null): AppAppArgs = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any])
    if (appArgs != null) __obj.updateDynamic("appArgs")(appArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAppArgs]
  }
}

