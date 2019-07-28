package typings.adone.adoneNs.fsNs.INs.GlobNs

import typings.adone.adoneNs.fsNs.INs.Stats
import typings.adone.adoneStrings.`match`
import typings.adone.adoneStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter
  extends typings.adone.adoneNs.eventNs.Emitter {
  /**
    * Stops the search permanently
    */
  def abort(): Unit = js.native
  def isIgnored(path: String): Boolean = js.native
  @JSName("on")
  def on_end(event: end, callback: js.Function1[/* matches */ js.Array[String], Unit]): this.type = js.native
  @JSName("on")
  def on_match(event: `match`, callback: js.Function2[/* match */ String, /* stat */ js.UndefOr[Stats], Unit]): this.type = js.native
  /**
    * Temporarely stops the search
    */
  def pause(): Unit = js.native
  /**
    * Resumes the search
    */
  def resume(): Unit = js.native
}

