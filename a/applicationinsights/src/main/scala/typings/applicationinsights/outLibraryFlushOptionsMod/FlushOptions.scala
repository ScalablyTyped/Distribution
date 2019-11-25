package typings.applicationinsights.outLibraryFlushOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushOptions extends js.Object {
  /**
    * Callback that will be invoked with the response from server, in case of isAppCrashing set to true,
    * with immediate notification that data was stored
    */
  var callback: js.UndefOr[js.Function1[/* v */ String, Unit]] = js.undefined
  /**
    * Flag indicating whether application is crashing. When this flag is set to true
    * and storing data locally is enabled, Node.JS SDK will attempt to store data on disk
    */
  var isAppCrashing: js.UndefOr[Boolean] = js.undefined
}

object FlushOptions {
  @scala.inline
  def apply(callback: /* v */ String => Unit = null, isAppCrashing: js.UndefOr[Boolean] = js.undefined): FlushOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(isAppCrashing)) __obj.updateDynamic("isAppCrashing")(isAppCrashing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushOptions]
  }
}

