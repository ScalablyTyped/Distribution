package typings.artyomJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FatalityPromiseCallback extends js.Object {
  var fatalityPromiseCallback: js.UndefOr[js.Any] = js.undefined
  var lastSay: js.UndefOr[js.Any] = js.undefined
  var redirectRecognizedTextOutput: js.UndefOr[js.Any] = js.undefined
  var remoteProcessorHandler: js.UndefOr[js.Any] = js.undefined
}

object FatalityPromiseCallback {
  @scala.inline
  def apply(
    fatalityPromiseCallback: js.Any = null,
    lastSay: js.Any = null,
    redirectRecognizedTextOutput: js.Any = null,
    remoteProcessorHandler: js.Any = null
  ): FatalityPromiseCallback = {
    val __obj = js.Dynamic.literal()
    if (fatalityPromiseCallback != null) __obj.updateDynamic("fatalityPromiseCallback")(fatalityPromiseCallback.asInstanceOf[js.Any])
    if (lastSay != null) __obj.updateDynamic("lastSay")(lastSay.asInstanceOf[js.Any])
    if (redirectRecognizedTextOutput != null) __obj.updateDynamic("redirectRecognizedTextOutput")(redirectRecognizedTextOutput.asInstanceOf[js.Any])
    if (remoteProcessorHandler != null) __obj.updateDynamic("remoteProcessorHandler")(remoteProcessorHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[FatalityPromiseCallback]
  }
}

