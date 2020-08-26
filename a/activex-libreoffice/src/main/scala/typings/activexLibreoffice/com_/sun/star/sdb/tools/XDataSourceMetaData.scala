package typings.activexLibreoffice.com_.sun.star.sdb.tools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDataSourceMetaData extends js.Object {
  /** determines whether the data source supports queries in the `FROM` part of a `SELECT` statement. */
  def supportsQueriesInFrom(): Boolean = js.native
}

object XDataSourceMetaData {
  @scala.inline
  def apply(supportsQueriesInFrom: () => Boolean): XDataSourceMetaData = {
    val __obj = js.Dynamic.literal(supportsQueriesInFrom = js.Any.fromFunction0(supportsQueriesInFrom))
    __obj.asInstanceOf[XDataSourceMetaData]
  }
  @scala.inline
  implicit class XDataSourceMetaDataOps[Self <: XDataSourceMetaData] (val x: Self) extends AnyVal {
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
    def setSupportsQueriesInFrom(value: () => Boolean): Self = this.set("supportsQueriesInFrom", js.Any.fromFunction0(value))
  }
  
}

