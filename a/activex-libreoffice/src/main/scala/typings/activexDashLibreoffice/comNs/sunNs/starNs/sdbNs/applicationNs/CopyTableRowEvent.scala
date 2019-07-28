package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.applicationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait CopyTableRowEvent extends EventObject {
  /**
    * denotes the error which happened while copying the data.
    *
    * Usually, this contains an instance of {@link com.sun.star.sdbc.SQLException} .
    */
  var Error: js.Any
  /** contains the result set which is being copied by the wizard currently. */
  var SourceData: XResultSet
}

object CopyTableRowEvent {
  @scala.inline
  def apply(Error: js.Any, Source: XInterface, SourceData: XResultSet): CopyTableRowEvent = {
    val __obj = js.Dynamic.literal(Error = Error, Source = Source, SourceData = SourceData)
  
    __obj.asInstanceOf[CopyTableRowEvent]
  }
}

