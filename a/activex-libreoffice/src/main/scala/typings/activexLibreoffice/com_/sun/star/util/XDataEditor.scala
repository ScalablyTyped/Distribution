package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects to a model and broadcasts status change events. */
@js.native
trait XDataEditor extends XInterface {
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  var Model: XInterface = js.native
  /** registers a listener to receive `DataEditorEvent` s. */
  def addDataEditorListener(listener: XDataEditorListener): Unit = js.native
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  def getModel(): XInterface = js.native
  /** unregisters a listener. */
  def removeDataEditorListener(listener: XDataEditorListener): Unit = js.native
  /** connects the data editor to a data model. */
  def setModel(model: XInterface): Unit = js.native
  /** makes the data editor visible to the user. */
  def show(): Unit = js.native
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
  @scala.inline
  implicit class XDataEditorOps[Self <: XDataEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModel(value: XInterface): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddDataEditorListener(value: XDataEditorListener => Unit): Self = this.set("addDataEditorListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetModel(value: () => XInterface): Self = this.set("getModel", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveDataEditorListener(value: XDataEditorListener => Unit): Self = this.set("removeDataEditorListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSetModel(value: XInterface => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

