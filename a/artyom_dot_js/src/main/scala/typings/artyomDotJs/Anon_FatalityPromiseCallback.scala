package typings.artyomDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FatalityPromiseCallback extends js.Object {
  var fatalityPromiseCallback: js.UndefOr[js.Any] = js.undefined
  var lastSay: js.UndefOr[js.Any] = js.undefined
  var redirectRecognizedTextOutput: js.UndefOr[js.Any] = js.undefined
  var remoteProcessorHandler: js.UndefOr[js.Any] = js.undefined
}

object Anon_FatalityPromiseCallback {
  @scala.inline
  def apply(
    fatalityPromiseCallback: js.Any = null,
    lastSay: js.Any = null,
    redirectRecognizedTextOutput: js.Any = null,
    remoteProcessorHandler: js.Any = null
  ): Anon_FatalityPromiseCallback = {
    val __obj = js.Dynamic.literal()
    if (fatalityPromiseCallback != null) __obj.updateDynamic("fatalityPromiseCallback")(fatalityPromiseCallback)
    if (lastSay != null) __obj.updateDynamic("lastSay")(lastSay)
    if (redirectRecognizedTextOutput != null) __obj.updateDynamic("redirectRecognizedTextOutput")(redirectRecognizedTextOutput)
    if (remoteProcessorHandler != null) __obj.updateDynamic("remoteProcessorHandler")(remoteProcessorHandler)
    __obj.asInstanceOf[Anon_FatalityPromiseCallback]
  }
}

