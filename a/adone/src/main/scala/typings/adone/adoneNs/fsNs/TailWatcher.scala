package typings.adone.adoneNs.fsNs

import typings.adone.adoneNs.eventNs.Emitter
import typings.adone.adoneNs.fsNs.INs.TailWatcherNs.ConstructorOptions
import typings.adone.adoneStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an event emitter that watches for a file growing,
  * emits "line" event for each new line in a file
  */
@JSGlobal("adone.fs.TailWatcher")
@js.native
class TailWatcher protected () extends Emitter {
  def this(filename: String) = this()
  def this(filename: String, options: ConstructorOptions) = this()
  @JSName("on")
  def on_line(event: line, callback: js.Function1[/* line */ String, Unit]): this.type = js.native
  /**
    * Stop watching
    */
  def unwatch(): Unit = js.native
}

