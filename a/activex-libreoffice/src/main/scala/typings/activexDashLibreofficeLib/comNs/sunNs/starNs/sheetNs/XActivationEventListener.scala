package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when the active spreadsheet changes. */
trait XActivationEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called whenever data or a selection changed.
    *
    * This interface must be implemented by components that wish to get notified of changes of the active {@link Spreadsheet} . They can be registered at an
    * XSpreadsheetViewEventProvider component.
    * @param aEvent the event that gives further information on which {@link Spreadsheet} is active now.
    * @see ActivationEvent
    * @see XSpreadsheetViewEventProvider
    * @since OOo 2.0
    */
  def activeSpreadsheetChanged(aEvent: ActivationEvent): scala.Unit
}

object XActivationEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    activeSpreadsheetChanged: js.Function1[ActivationEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XActivationEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activeSpreadsheetChanged")(activeSpreadsheetChanged)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XActivationEventListener]
  }
}

