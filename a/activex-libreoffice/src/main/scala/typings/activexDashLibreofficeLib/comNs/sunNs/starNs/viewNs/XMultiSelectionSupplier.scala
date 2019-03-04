package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to append and remove objects from a selection.
  *
  * The method XSelectionSupplier::setSelection() for an instance that also supports {@link XMultiSelectionSupplier} should be implemented that it also
  * takes either a selectable object or a sequence of selectable objects.
  *
  * Adding an object more than once to a selection should not toggle the selection for that object but only select it once
  */
trait XMultiSelectionSupplier extends XSelectionSupplier {
  /** returns the number of selected objects of this {@link XMultiSelectionSupplier} . */
  val SelectionCount: scala.Double
  /**
    * adds the object or the objects represented by **Selection** to the selection of this {@link XMultiSelectionSupplier} .
    * @param Selection either an Object that is selectable or a sequence of objects that are selectable.
    * @returns `TRUE` /, if **Selection** was added to the current selection. `FALSE` , if **Selection** or parts of **Selection** could not be added to the cur
    * @throws com::sun::star::lang::IllegalArgumentException If **Selection** is not a selectable object for this {@link XMultiSelectionSupplier} . Adding an o
    */
  def addSelection(Selection: js.Any): scala.Boolean
  /** clears the selection of this {@link XMultiSelectionSupplier} . */
  def clearSelection(): scala.Unit
  /** @returns a new object to enumerate the selection of this {@link XMultiSelectionSupplier} in reverse order. If the order of the selected objects It returns */
  def createReverseSelectionEnumeration(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
  /** @returns a new object to enumerate the selection of this {@link XMultiSelectionSupplier} . It returns NULL if there are no objects in the selection. */
  def createSelectionEnumeration(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
  /** returns the number of selected objects of this {@link XMultiSelectionSupplier} . */
  def getSelectionCount(): scala.Double
  /**
    * remove the object or objects represented by **Selection** from the selection of this {@link XMultiSelectionSupplier} .
    * @param Selection either an Object that is selectable or a sequence of objects that are selectable.
    * @returns `TRUE` /, if **Selection** was added to the current selection. `FALSE` , if **Selection** or parts of **Selection** could not be added to the cur
    * @throws com::sun::star::lang::IllegalArgumentException If **Selection** is not a selectable object for this {@link XMultiSelectionSupplier} . Removing an
    */
  def removeSelection(Selection: js.Any): scala.Unit
}

object XMultiSelectionSupplier {
  @scala.inline
  def apply(
    Selection: js.Any,
    SelectionCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    addSelection: js.Function1[js.Any, scala.Boolean],
    addSelectionChangeListener: js.Function1[XSelectionChangeListener, scala.Unit],
    clearSelection: js.Function0[scala.Unit],
    createReverseSelectionEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    createSelectionEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getSelection: js.Function0[js.Any],
    getSelectionCount: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSelection: js.Function1[js.Any, scala.Unit],
    removeSelectionChangeListener: js.Function1[XSelectionChangeListener, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean]
  ): XMultiSelectionSupplier = {
    val __obj = js.Dynamic.literal(Selection = Selection, SelectionCount = SelectionCount, acquire = acquire, addSelection = addSelection, addSelectionChangeListener = addSelectionChangeListener, clearSelection = clearSelection, createReverseSelectionEnumeration = createReverseSelectionEnumeration, createSelectionEnumeration = createSelectionEnumeration, getSelection = getSelection, getSelectionCount = getSelectionCount, queryInterface = queryInterface, release = release, removeSelection = removeSelection, removeSelectionChangeListener = removeSelectionChangeListener, select = select)
  
    __obj.asInstanceOf[XMultiSelectionSupplier]
  }
}

