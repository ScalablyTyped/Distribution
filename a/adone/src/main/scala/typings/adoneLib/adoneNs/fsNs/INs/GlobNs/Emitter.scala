package typings
package adoneLib.adoneNs.fsNs.INs.GlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter
  extends adoneLib.adoneNs.eventNs.Emitter {
  /**
                   * Stops the search permanently
                   */
  def abort(): scala.Unit = js.native
  def isIgnored(path: java.lang.String): scala.Boolean = js.native
  @JSName("on")
  def on_end(
    event: adoneLib.adoneLibStrings.end,
    callback: js.Function1[/* matches */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_match(
    event: adoneLib.adoneLibStrings.`match`,
    callback: js.Function2[
      /* match */ java.lang.String, 
      /* stat */ js.UndefOr[adoneLib.adoneNs.fsNs.INs.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
                   * Temporarely stops the search
                   */
  def pause(): scala.Unit = js.native
  /**
                   * Resumes the search
                   */
  def resume(): scala.Unit = js.native
}

