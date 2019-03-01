package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the interface required to listen for progress in copying table rows via a `CopyTableWizard` .
  * @see CopyTableRowEvent
  * @see CopyTableWizard
  */
trait XCopyTableListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when a row was successfully copied.
    *
    * This method is called right after a row has been successfully copied. It might be used, for instance, to update a progress indicator.
    * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which was just copied to t
    */
  def copiedRow(Event: CopyTableRowEvent): scala.Unit
  /**
    * is called when copying a row failed.
    * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which was attempted to be
    * @returns how to continue with copying. Must be one of the {@link CopyTableContinuation} constants.
    */
  def copyRowError(Event: CopyTableRowEvent): scala.Double
  /**
    * is called when a row is about to be copied.
    *
    * This method is called immediately before a row is copied. It might be used, for instance, to update a progress indicator.
    * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which is about to be copied.
    */
  def copyingRow(Event: CopyTableRowEvent): scala.Unit
}

object XCopyTableListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    copiedRow: js.Function1[CopyTableRowEvent, scala.Unit],
    copyRowError: js.Function1[CopyTableRowEvent, scala.Double],
    copyingRow: js.Function1[CopyTableRowEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCopyTableListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copiedRow")(copiedRow)
    __obj.updateDynamic("copyRowError")(copyRowError)
    __obj.updateDynamic("copyingRow")(copyingRow)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCopyTableListener]
  }
}

