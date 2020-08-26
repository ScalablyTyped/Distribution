package typings.archiver.mod

import typings.node.fsMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryData extends js.Object {
  /** Sets the entry date */
  var date: js.UndefOr[Date | String] = js.native
  /** Sets the entry permissions */
  var mode: js.UndefOr[Double] = js.native
  /** Sets the entry name including internal path */
  var name: String = js.native
  /**
    * Sets a path prefix for the entry name.
    * Useful when working with methods like `directory` or `glob`
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Sets the fs stat data for this entry allowing
    * for reduction of fs stat calls when stat data is already known
    */
  var stats: js.UndefOr[Stats] = js.native
}

object EntryData {
  @scala.inline
  def apply(name: String): EntryData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryData]
  }
  @scala.inline
  implicit class EntryDataOps[Self <: EntryData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
  
}

