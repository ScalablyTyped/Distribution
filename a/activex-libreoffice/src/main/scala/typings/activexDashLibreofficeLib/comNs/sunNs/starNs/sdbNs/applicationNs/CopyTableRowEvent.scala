package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event happening while copying table data between databases.
  *
  * Whenever this event is fired to an {@link XCopyTableListener} , {@link com.sun.star.lang.EventObject.Source} contains the wizard instance which
  * actually does the copying.
  * @see CopyTableWizard
  */
trait CopyTableRowEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * denotes the error which happened while copying the data.
    *
    * Usually, this contains an instance of {@link com.sun.star.sdbc.SQLException} .
    */
  var Error: js.Any
  /** contains the result set which is being copied by the wizard currently. */
  var SourceData: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
}

object CopyTableRowEvent {
  @scala.inline
  def apply(
    Error: js.Any,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    SourceData: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
  ): CopyTableRowEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("SourceData")(SourceData)
    __obj.asInstanceOf[CopyTableRowEvent]
  }
}

