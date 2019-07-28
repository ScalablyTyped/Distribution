package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDataSourceMetaData extends js.Object {
  /** determines whether the data source supports queries in the `FROM` part of a `SELECT` statement. */
  def supportsQueriesInFrom(): Boolean
}

object XDataSourceMetaData {
  @scala.inline
  def apply(supportsQueriesInFrom: () => Boolean): XDataSourceMetaData = {
    val __obj = js.Dynamic.literal(supportsQueriesInFrom = js.Any.fromFunction0(supportsQueriesInFrom))
  
    __obj.asInstanceOf[XDataSourceMetaData]
  }
}

