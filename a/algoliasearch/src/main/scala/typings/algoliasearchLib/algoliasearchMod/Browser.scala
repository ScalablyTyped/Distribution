package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  @JSName("on")
  def on_end(`type`: algoliasearchLib.algoliasearchLibStrings.end, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_error(
    `type`: algoliasearchLib.algoliasearchLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_result(
    `type`: algoliasearchLib.algoliasearchLibStrings.result,
    cb: js.Function1[/* content */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_stop(`type`: algoliasearchLib.algoliasearchLibStrings.stop, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

