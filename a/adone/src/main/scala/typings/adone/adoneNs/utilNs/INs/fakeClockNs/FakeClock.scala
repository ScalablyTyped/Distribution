package typings.adone.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeClock extends js.Object {
  var timers: Timers = js.native
  def createClock(): Clock = js.native
  def createClock(now: Double): Clock = js.native
  def createClock(now: Double, loopLimit: Double): Clock = js.native
  def install(): InstalledClock = js.native
  def install(now: Double): InstalledClock = js.native
  def install(now: InstallOptions): InstalledClock = js.native
  def install(now: typings.std.Date): InstalledClock = js.native
}

