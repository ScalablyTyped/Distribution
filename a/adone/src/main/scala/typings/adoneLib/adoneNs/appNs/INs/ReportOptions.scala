package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var directory: js.UndefOr[java.lang.String] = js.undefined
  var events: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(
    directory: java.lang.String = null,
    events: java.lang.String = null,
    filename: java.lang.String = null,
    signal: java.lang.String = null
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (events != null) __obj.updateDynamic("events")(events)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ReportOptions]
  }
}

