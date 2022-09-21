package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access and change the selection in a view.
  * @see OfficeDocumentView
  */
trait XSelectionSupplier
  extends StObject
     with XInterface {
  
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  val Selection: Any
  
  /** registers an event listener, which is called when the selection changes. */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  def getSelection(): Any
  
  /** unregisters an event listener which was registered with {@link XSelectionSupplier.addSelectionChangeListener()} . */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  
  /** selects the object represented by **xSelection** if it is known and selectable in this object. */
  def select(xSelection: Any): Boolean
}
object XSelectionSupplier {
  
  inline def apply(
    Selection: Any,
    acquire: () => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    getSelection: () => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    select: Any => Boolean
  ): XSelectionSupplier = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getSelection = js.Any.fromFunction0(getSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[XSelectionSupplier]
  }
  
  extension [Self <: XSelectionSupplier](x: Self) {
    
    inline def setAddSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = StObject.set(x, "addSelectionChangeListener", js.Any.fromFunction1(value))
    
    inline def setGetSelection(value: () => Any): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    inline def setRemoveSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = StObject.set(x, "removeSelectionChangeListener", js.Any.fromFunction1(value))
    
    inline def setSelect(value: Any => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelection(value: Any): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}
