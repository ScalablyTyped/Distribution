package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every AV application installed on a device registered for
  * push notifications has an associated Installation object.
  */
@js.native
trait Installation extends Object {
  var AVVersion: java.lang.String = js.native
  var appIdentifier: java.lang.String = js.native
  var appName: java.lang.String = js.native
  var appVersion: java.lang.String = js.native
  var badge: js.Any = js.native
  var channelUris: java.lang.String = js.native
  var channels: js.Array[java.lang.String] = js.native
  var deviceToken: java.lang.String = js.native
  var deviceType: java.lang.String = js.native
  var installationId: java.lang.String = js.native
  var pushType: java.lang.String = js.native
  var timeZone: js.Any = js.native
}

