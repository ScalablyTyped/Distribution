package typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod

import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.change
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "TrackerBase")
@js.native
class TrackerBase () extends EventEmitter {
  def this(name: String) = this()
  @JSName("addListener")
  def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  @JSName("on")
  def on_change(event: change, listener: TrackerEventListener): this.type = js.native
  @JSName("once")
  def once_change(event: change, listener: TrackerEventListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
}

