package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** connects to a model and broadcasts status change events. */
trait XDataEditor
  extends StObject
     with XInterface {
  
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  var Model: XInterface
  
  /** registers a listener to receive `DataEditorEvent` s. */
  def addDataEditorListener(listener: XDataEditorListener): Unit
  
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  def getModel(): XInterface
  
  /** unregisters a listener. */
  def removeDataEditorListener(listener: XDataEditorListener): Unit
  
  /** connects the data editor to a data model. */
  def setModel(model: XInterface): Unit
  
  /** makes the data editor visible to the user. */
  def show(): Unit
}
object XDataEditor {
  
  inline def apply(
    Model: XInterface,
    acquire: () => Unit,
    addDataEditorListener: XDataEditorListener => Unit,
    getModel: () => XInterface,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeDataEditorListener: XDataEditorListener => Unit,
    setModel: XInterface => Unit,
    show: () => Unit
  ): XDataEditor = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDataEditorListener = js.Any.fromFunction1(addDataEditorListener), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataEditorListener = js.Any.fromFunction1(removeDataEditorListener), setModel = js.Any.fromFunction1(setModel), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[XDataEditor]
  }
  
  extension [Self <: XDataEditor](x: Self) {
    
    inline def setAddDataEditorListener(value: XDataEditorListener => Unit): Self = StObject.set(x, "addDataEditorListener", js.Any.fromFunction1(value))
    
    inline def setGetModel(value: () => XInterface): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    inline def setModel(value: XInterface): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setRemoveDataEditorListener(value: XDataEditorListener => Unit): Self = StObject.set(x, "removeDataEditorListener", js.Any.fromFunction1(value))
    
    inline def setSetModel(value: XInterface => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
