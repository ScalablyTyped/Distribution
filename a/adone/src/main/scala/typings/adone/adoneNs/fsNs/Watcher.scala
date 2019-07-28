package typings.adone.adoneNs.fsNs

import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneNs.eventNs.Emitter
import typings.adone.adoneNs.fsNs.INs.Stats
import typings.adone.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions
import typings.adone.adoneNs.fsNs.INs.WatcherNs.Event
import typings.adone.adoneStrings.all
import typings.adone.adoneStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a file watcher
  */
@JSGlobal("adone.fs.Watcher")
@js.native
class Watcher () extends Emitter {
  def this(options: ConstructorOptions) = this()
  /**
    * Adds files, directories, or glob patterns for tracking
    */
  def add(path: String): this.type = js.native
  def add(path: js.Array[String]): this.type = js.native
  /**
    * Removes all listeners from watched files
    */
  def close(): this.type = js.native
  /**
    * Returns an object representing all the paths on the file system being watched by this watcher
    */
  def getWatched(): StringDictionary[js.Array[String]] = js.native
  def on(event: Event, callback: js.Function2[/* path */ String, /* stat */ js.UndefOr[Stats], Unit]): this.type = js.native
  @JSName("on")
  def on_all(
    event: all,
    callback: js.Function3[/* event */ Event, /* path */ String, /* stat */ js.UndefOr[Stats], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_raw(
    event: raw,
    callback: js.Function3[/* event */ String, /* path */ String, /* details */ js.Object, Unit]
  ): this.type = js.native
  /**
    * Stops watching files, directories, or glob patterns.
    */
  def unwatch(path: String): this.type = js.native
  def unwatch(path: js.Array[String]): this.type = js.native
}

