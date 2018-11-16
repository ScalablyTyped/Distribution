package typings
package arangodbLib.queuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Job extends js.Object {
  var created: scala.Double
  var data: js.Any
  var delayUntil: scala.Double
  var failure: js.UndefOr[java.lang.String] = js.undefined
  var failures: js.Array[js.Object]
  var maxFailures: scala.Double
  var modified: scala.Double
  var queue: java.lang.String
  var repeatDelay: scala.Double
  var repeatTimes: scala.Double
  var repeatUntil: scala.Double
  var runFailures: scala.Double
  var runs: scala.Double
  var status: java.lang.String
  var success: js.UndefOr[java.lang.String] = js.undefined
  var `type`: Script
  def abort(): scala.Unit
}

