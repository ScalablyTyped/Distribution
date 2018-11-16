package typings
package areDashWeDashThereDashYetLib.areDashWeDashThereDashYetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "Tracker")
@js.native
class Tracker () extends TrackerBase {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, todo: scala.Double) = this()
  def addWork(work: scala.Double): scala.Unit = js.native
  def completeWork(completed: scala.Double): scala.Unit = js.native
  def completed(): scala.Double = js.native
  def finish(): scala.Unit = js.native
}

