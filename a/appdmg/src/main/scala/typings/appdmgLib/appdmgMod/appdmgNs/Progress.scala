package typings
package appdmgLib.appdmgMod.appdmgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var current: scala.Double
  var status: appdmgLib.appdmgLibStrings.ok | appdmgLib.appdmgLibStrings.skip | appdmgLib.appdmgLibStrings.fail
  var title: java.lang.String
  var total: scala.Double
  var `type`: appdmgLib.appdmgLibStrings.`step-begin` | appdmgLib.appdmgLibStrings.`step-end`
}

