package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryData extends js.Object {
  var date: js.UndefOr[stdLib.Date | java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var stats: js.UndefOr[nodeLib.fsMod.Stats] = js.undefined
}

object EntryData {
  @scala.inline
  def apply(
    date: stdLib.Date | java.lang.String = null,
    mode: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    stats: nodeLib.fsMod.Stats = null
  ): EntryData = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[EntryData]
  }
}

