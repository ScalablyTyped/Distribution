package typings
package aosLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def addEventListener(
    `type`: aosLib.aosMod.AosEventType,
    listener: js.Function1[/* event */ aosLib.aosMod.AosEvent, scala.Unit]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: aosLib.aosMod.AosEventType,
    listener: js.Function1[/* event */ aosLib.aosMod.AosEvent, scala.Unit],
    options: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: aosLib.aosMod.AosEventType,
    listener: js.Function1[/* event */ aosLib.aosMod.AosEvent, scala.Unit],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
}

