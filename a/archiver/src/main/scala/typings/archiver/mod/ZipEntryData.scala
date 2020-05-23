package typings.archiver.mod

import typings.node.fsMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipEntryData extends EntryData {
  /** Sets the compression method to STORE */
  var store: js.UndefOr[Boolean] = js.undefined
}

object ZipEntryData {
  @scala.inline
  def apply(
    name: String,
    date: Date | String = null,
    mode: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    stats: Stats = null,
    store: js.UndefOr[Boolean] = js.undefined
  ): ZipEntryData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipEntryData]
  }
}

