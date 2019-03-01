package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDataSourceMetaData extends js.Object {
  /** determines whether the data source supports queries in the `FROM` part of a `SELECT` statement. */
  def supportsQueriesInFrom(): scala.Boolean
}

object XDataSourceMetaData {
  @scala.inline
  def apply(supportsQueriesInFrom: js.Function0[scala.Boolean]): XDataSourceMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("supportsQueriesInFrom")(supportsQueriesInFrom)
    __obj.asInstanceOf[XDataSourceMetaData]
  }
}

