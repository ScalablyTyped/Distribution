package typings.archiver.anon

import typings.node.fsMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined archiver.archiver.Partial<archiver.archiver.EntryData> */
trait PartialEntryData extends js.Object {
  var date: js.UndefOr[Date | String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
}

object PartialEntryData {
  @scala.inline
  def apply(
    date: Date | String = null,
    mode: js.UndefOr[Double] = js.undefined,
    name: String = null,
    prefix: String = null,
    stats: Stats = null
  ): PartialEntryData = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEntryData]
  }
}

