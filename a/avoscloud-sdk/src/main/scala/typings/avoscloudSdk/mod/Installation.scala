package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every AV application installed on a device registered for
  * push notifications has an associated Installation object.
  */
@JSImport("avoscloud-sdk", "Installation")
@js.native
class Installation () extends Object {
  var AVVersion: String = js.native
  var appIdentifier: String = js.native
  var appName: String = js.native
  var appVersion: String = js.native
  var badge: js.Any = js.native
  var channelUris: String = js.native
  var channels: js.Array[String] = js.native
  var deviceToken: String = js.native
  var deviceType: String = js.native
  var installationId: String = js.native
  var pushType: String = js.native
  var timeZone: js.Any = js.native
}

