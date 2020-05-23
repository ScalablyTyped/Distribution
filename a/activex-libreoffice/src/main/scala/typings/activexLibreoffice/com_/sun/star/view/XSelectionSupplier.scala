package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access and change the selection in a view.
  * @see OfficeDocumentView
  */
trait XSelectionSupplier extends XInterface {
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  val Selection: js.Any
  /** registers an event listener, which is called when the selection changes. */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  def getSelection(): js.Any
  /** unregisters an event listener which was registered with {@link XSelectionSupplier.addSelectionChangeListener()} . */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  /** selects the object represented by **xSelection** if it is known and selectable in this object. */
  def select(xSelection: js.Any): Boolean
}

object XSelectionSupplier {
  @scala.inline
  def apply(
    Selection: js.Any,
    acquire: () => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    getSelection: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    select: js.Any => Boolean
  ): XSelectionSupplier = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getSelection = js.Any.fromFunction0(getSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[XSelectionSupplier]
  }
}

