package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Every AV application installed on a device registered for
     * push notifications has an associated Installation object.
     */
/* RemoveDifficultInheritance: 
- Dropped Object */ 
trait Installation extends js.Object {
  var AVVersion: java.lang.String
  var appIdentifier: java.lang.String
  var appName: java.lang.String
  var appVersion: java.lang.String
  var badge: js.Any
  var channelUris: java.lang.String
  var channels: js.Array[java.lang.String]
  var deviceToken: java.lang.String
  var deviceType: java.lang.String
  var installationId: java.lang.String
  var pushType: java.lang.String
  var timeZone: js.Any
}

