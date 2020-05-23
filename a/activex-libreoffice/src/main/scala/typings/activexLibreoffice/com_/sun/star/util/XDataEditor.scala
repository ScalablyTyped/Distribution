package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects to a model and broadcasts status change events. */
trait XDataEditor extends XInterface {
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
  @scala.inline
  def apply(
    Model: XInterface,
    acquire: () => Unit,
    addDataEditorListener: XDataEditorListener => Unit,
    getModel: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDataEditorListener: XDataEditorListener => Unit,
    setModel: XInterface => Unit,
    show: () => Unit
  ): XDataEditor = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDataEditorListener = js.Any.fromFunction1(addDataEditorListener), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataEditorListener = js.Any.fromFunction1(removeDataEditorListener), setModel = js.Any.fromFunction1(setModel), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[XDataEditor]
  }
}

