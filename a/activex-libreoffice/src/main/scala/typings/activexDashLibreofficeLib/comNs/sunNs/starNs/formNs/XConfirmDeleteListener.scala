package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to register a component for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteBroadcaster
  */
trait XConfirmDeleteListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when the current record of a database form will be deleted.
    * @param aEvent A descriptor specifying the deletion request.
    * @returns `TRUE` when the row can be deleted, otherwise `FALSE` .
    */
  def confirmDelete(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RowChangeEvent): scala.Boolean
}

object XConfirmDeleteListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    confirmDelete: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RowChangeEvent, scala.Boolean],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConfirmDeleteListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("confirmDelete")(confirmDelete)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XConfirmDeleteListener]
  }
}

