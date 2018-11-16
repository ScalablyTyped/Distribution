package typings
package areDashWeDashThereDashYetLib.areDashWeDashThereDashYetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "TrackerGroup")
@js.native
class TrackerGroup () extends TrackerBase {
  def this(name: java.lang.String) = this()
  def addUnit(tracker: TrackerBase): TrackerObject = js.native
  def addUnit(tracker: TrackerBase, weight: scala.Double): TrackerObject = js.native
  def completed(): scala.Double = js.native
  def debug(): java.lang.String = js.native
  def finish(): scala.Unit = js.native
  def newGroup(): TrackerGroup = js.native
  def newGroup(name: java.lang.String): TrackerGroup = js.native
  def newGroup(name: java.lang.String, weight: scala.Double): TrackerGroup = js.native
  def newItem(): Tracker = js.native
  def newItem(name: java.lang.String): Tracker = js.native
  def newItem(name: java.lang.String, todo: scala.Double): Tracker = js.native
  def newItem(name: java.lang.String, todo: scala.Double, weight: scala.Double): Tracker = js.native
  def newStream(): TrackerStream = js.native
  def newStream(name: java.lang.String): TrackerStream = js.native
  def newStream(name: java.lang.String, todo: scala.Double): TrackerStream = js.native
  def newStream(name: java.lang.String, todo: scala.Double, weight: scala.Double): TrackerStream = js.native
}

