package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var events: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var signal: js.UndefOr[String] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(directory: String = null, events: String = null, filename: String = null, signal: String = null): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (events != null) __obj.updateDynamic("events")(events)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ReportOptions]
  }
}

