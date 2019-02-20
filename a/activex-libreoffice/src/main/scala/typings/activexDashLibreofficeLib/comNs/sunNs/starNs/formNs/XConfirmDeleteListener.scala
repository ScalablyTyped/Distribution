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

