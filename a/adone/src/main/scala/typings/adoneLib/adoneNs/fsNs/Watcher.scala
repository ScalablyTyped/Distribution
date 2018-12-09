package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents a file watcher
         */
@JSGlobal("adone.fs.Watcher")
@js.native
class Watcher ()
  extends adoneLib.adoneNs.eventNs.Emitter {
  def this(options: adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions) = this()
  /**
               * Adds files, directories, or glob patterns for tracking
               */
  def add(path: java.lang.String): this.type = js.native
  /**
               * Adds files, directories, or glob patterns for tracking
               */
  def add(path: js.Array[java.lang.String]): this.type = js.native
  /**
               * Removes all listeners from watched files
               */
  def close(): this.type = js.native
  /**
               * Returns an object representing all the paths on the file system being watched by this watcher
               */
  def getWatched(): ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def on(
    event: adoneLib.adoneNs.fsNs.INs.WatcherNs.Event,
    callback: js.Function2[
      /* path */ java.lang.String, 
      /* stat */ js.UndefOr[adoneLib.adoneNs.fsNs.INs.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_all(
    event: adoneLib.adoneLibStrings.all,
    callback: js.Function3[
      /* event */ adoneLib.adoneNs.fsNs.INs.WatcherNs.Event, 
      /* path */ java.lang.String, 
      /* stat */ js.UndefOr[adoneLib.adoneNs.fsNs.INs.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_raw(
    event: adoneLib.adoneLibStrings.raw,
    callback: js.Function3[
      /* event */ java.lang.String, 
      /* path */ java.lang.String, 
      /* details */ js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
               * Stops watching files, directories, or glob patterns.
               */
  def unwatch(path: java.lang.String): this.type = js.native
  /**
               * Stops watching files, directories, or glob patterns.
               */
  def unwatch(path: js.Array[java.lang.String]): this.type = js.native
}

