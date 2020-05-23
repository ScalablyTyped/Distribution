package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnoopId extends js.Object {
  var app: String
  var appArgs: js.UndefOr[String] = js.undefined
  var channelId: String
  var snoopId: js.UndefOr[String] = js.undefined
  var spy: js.UndefOr[String] = js.undefined
  var whisper: js.UndefOr[String] = js.undefined
}

object SnoopId {
  @scala.inline
  def apply(
    app: String,
    channelId: String,
    appArgs: String = null,
    snoopId: String = null,
    spy: String = null,
    whisper: String = null
  ): SnoopId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any])
    if (appArgs != null) __obj.updateDynamic("appArgs")(appArgs.asInstanceOf[js.Any])
    if (snoopId != null) __obj.updateDynamic("snoopId")(snoopId.asInstanceOf[js.Any])
    if (spy != null) __obj.updateDynamic("spy")(spy.asInstanceOf[js.Any])
    if (whisper != null) __obj.updateDynamic("whisper")(whisper.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnoopId]
  }
}

