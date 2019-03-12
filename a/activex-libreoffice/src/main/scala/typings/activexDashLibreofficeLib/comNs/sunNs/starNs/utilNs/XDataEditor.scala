package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects to a model and broadcasts status change events. */
trait XDataEditor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** registers a listener to receive `DataEditorEvent` s. */
  def addDataEditorListener(listener: XDataEditorListener): scala.Unit
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  def getModel(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** unregisters a listener. */
  def removeDataEditorListener(listener: XDataEditorListener): scala.Unit
  /** connects the data editor to a data model. */
  def setModel(model: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
  /** makes the data editor visible to the user. */
  def show(): scala.Unit
}

object XDataEditor {
  @scala.inline
  def apply(
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    acquire: () => scala.Unit,
    addDataEditorListener: XDataEditorListener => scala.Unit,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeDataEditorListener: XDataEditorListener => scala.Unit,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    show: () => scala.Unit
  ): XDataEditor = {
    val __obj = js.Dynamic.literal(Model = Model, acquire = js.Any.fromFunction0(acquire), addDataEditorListener = js.Any.fromFunction1(addDataEditorListener), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataEditorListener = js.Any.fromFunction1(removeDataEditorListener), setModel = js.Any.fromFunction1(setModel), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[XDataEditor]
  }
}

