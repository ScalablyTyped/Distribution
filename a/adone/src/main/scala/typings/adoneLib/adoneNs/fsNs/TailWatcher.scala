package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents an event emitter that watches for a file growing,
         * emits "line" event for each new line in a file
         */
@JSGlobal("adone.fs.TailWatcher")
@js.native
class TailWatcher protected ()
  extends adoneLib.adoneNs.eventNs.Emitter {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.TailWatcherNs.ConstructorOptions) = this()
  @JSName("on")
  def on_line(
    event: adoneLib.adoneLibStrings.line,
    callback: js.Function1[/* line */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
               * Stop watching
               */
  def unwatch(): scala.Unit = js.native
}

