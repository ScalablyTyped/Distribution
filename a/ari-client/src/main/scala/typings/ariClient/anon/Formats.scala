package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formats extends js.Object {
  var app: String
  var appArgs: js.UndefOr[String] = js.undefined
  var endpoint: String
  var formats: js.UndefOr[String] = js.undefined
  var originator: js.UndefOr[String] = js.undefined
  var otherChannelId: js.UndefOr[String] = js.undefined
}

object Formats {
  @scala.inline
  def apply(
    app: String,
    endpoint: String,
    appArgs: String = null,
    formats: String = null,
    originator: String = null,
    otherChannelId: String = null
  ): Formats = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    if (appArgs != null) __obj.updateDynamic("appArgs")(appArgs.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (originator != null) __obj.updateDynamic("originator")(originator.asInstanceOf[js.Any])
    if (otherChannelId != null) __obj.updateDynamic("otherChannelId")(otherChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
}

