package typings
package areDashWeDashThereDashYetLib.areDashWeDashThereDashYetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "TrackerBase")
@js.native
class TrackerBase ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(name: java.lang.String) = this()
  @JSName("addListener")
  def addListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("on")
  def on_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("once")
  def once_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
}

