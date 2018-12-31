package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Map that keeps keys only for a specified interval of time
  */
@JSGlobal("adone.collection.TimeMap")
@js.native
/**
  * @param timeout maximum age of the keys, 1000 by default
  * @param callback callback that is called with each key when the timeout is passed
  */
class TimeMap[K, V] ()
  extends lodashLib.lodashMod.Global.Map[K, V] {
  def this(timeout: scala.Double) = this()
  def this(timeout: scala.Double, callback: js.Function1[/* key */ K, scala.Unit]) = this()
  /**
    * Deletes the given key
    */
  def delete(key: K): scala.Boolean = js.native
  /**
    * Iterates over the map and calls the callback for each element
    */
  def forEach[T](
    callback: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, scala.Unit]
  ): this.type = js.native
  def forEach[T](
    callback: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, scala.Unit],
    thisArg: T
  ): this.type = js.native
  /**
    * Gets the timeout
    */
  def getTimeout(): scala.Double = js.native
  /**
    * Sets the timeout
    */
  def setTimeout(ms: scala.Double): scala.Unit = js.native
}

