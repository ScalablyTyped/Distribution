package typings.archiver.mod

import typings.node.fsMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryData extends js.Object {
  /** Sets the entry date */
  var date: js.UndefOr[Date | String] = js.undefined
  /** Sets the entry permissions */
  var mode: js.UndefOr[Double] = js.undefined
  /** Sets the entry name including internal path */
  var name: String
  /**
    * Sets a path prefix for the entry name.
    * Useful when working with methods like `directory` or `glob`
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Sets the fs stat data for this entry allowing
    * for reduction of fs stat calls when stat data is already known
    */
  var stats: js.UndefOr[Stats] = js.undefined
}

object EntryData {
  @scala.inline
  def apply(
    name: String,
    date: Date | String = null,
    mode: Int | Double = null,
    prefix: String = null,
    stats: Stats = null
  ): EntryData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryData]
  }
}

