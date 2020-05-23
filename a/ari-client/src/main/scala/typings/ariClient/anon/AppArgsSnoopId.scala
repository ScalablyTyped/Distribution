package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppArgsSnoopId extends js.Object {
  var app: String
  var appArgs: js.UndefOr[String] = js.undefined
  var snoopId: String
  var spy: js.UndefOr[String] = js.undefined
  var whisper: js.UndefOr[String] = js.undefined
}

object AppArgsSnoopId {
  @scala.inline
  def apply(app: String, snoopId: String, appArgs: String = null, spy: String = null, whisper: String = null): AppArgsSnoopId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], snoopId = snoopId.asInstanceOf[js.Any])
    if (appArgs != null) __obj.updateDynamic("appArgs")(appArgs.asInstanceOf[js.Any])
    if (spy != null) __obj.updateDynamic("spy")(spy.asInstanceOf[js.Any])
    if (whisper != null) __obj.updateDynamic("whisper")(whisper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppArgsSnoopId]
  }
}

