package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access and change the selection in a view.
  * @see OfficeDocumentView
  */
trait XSelectionSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  val Selection: js.Any
  /** registers an event listener, which is called when the selection changes. */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): scala.Unit
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  def getSelection(): js.Any
  /** unregisters an event listener which was registered with {@link XSelectionSupplier.addSelectionChangeListener()} . */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): scala.Unit
  /** selects the object represented by **xSelection** if it is known and selectable in this object. */
  def select(xSelection: js.Any): scala.Boolean
}

object XSelectionSupplier {
  @scala.inline
  def apply(
    Selection: js.Any,
    acquire: js.Function0[scala.Unit],
    addSelectionChangeListener: js.Function1[XSelectionChangeListener, scala.Unit],
    getSelection: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSelectionChangeListener: js.Function1[XSelectionChangeListener, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean]
  ): XSelectionSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[XSelectionSupplier]
  }
}

