package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access and change the selection in a view.
  * @see OfficeDocumentView
  */
@js.native
trait XSelectionSupplier extends XInterface {
  
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  val Selection: js.Any = js.native
  
  /** registers an event listener, which is called when the selection changes. */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): Unit = js.native
  
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  def getSelection(): js.Any = js.native
  
  /** unregisters an event listener which was registered with {@link XSelectionSupplier.addSelectionChangeListener()} . */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): Unit = js.native
  
  /** selects the object represented by **xSelection** if it is known and selectable in this object. */
  def select(xSelection: js.Any): Boolean = js.native
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
  
  @scala.inline
  implicit class XSelectionSupplierMutableBuilder[Self <: XSelectionSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = StObject.set(x, "addSelectionChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelection(value: () => js.Any): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = StObject.set(x, "removeSelectionChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelect(value: js.Any => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelection(value: js.Any): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}
