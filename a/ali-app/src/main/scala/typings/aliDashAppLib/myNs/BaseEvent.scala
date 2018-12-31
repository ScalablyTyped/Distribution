package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[T /* <: java.lang.String */, Detail] extends js.Object {
  var currentTarget: EventTarget
  var detail: Detail
  var target: EventTarget
  var timeStamp: scala.Double
  var `type`: T
}

