package typings
package adoneLib.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeClock extends js.Object {
  var timers: Timers = js.native
  def createClock(): Clock = js.native
  def createClock(now: scala.Double): Clock = js.native
  def createClock(now: scala.Double, loopLimit: scala.Double): Clock = js.native
  def install(): InstalledClock = js.native
  def install(now: InstallOptions): InstalledClock = js.native
  def install(now: scala.Double): InstalledClock = js.native
  def install(now: stdLib.Date): InstalledClock = js.native
}

