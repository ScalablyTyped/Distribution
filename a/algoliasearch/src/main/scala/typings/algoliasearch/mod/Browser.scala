package typings.algoliasearch.mod

import typings.algoliasearch.algoliasearchStrings.end
import typings.algoliasearch.algoliasearchStrings.error
import typings.algoliasearch.algoliasearchStrings.result
import typings.algoliasearch.algoliasearchStrings.stop
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  @JSName("on")
  def on_end(`type`: end, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("on")
  def on_result(`type`: result, cb: js.Function1[/* content */ BrowseResponse, Unit]): Unit = js.native
  @JSName("on")
  def on_stop(`type`: stop, cb: js.Function0[Unit]): Unit = js.native
  def stop(): Unit = js.native
}

