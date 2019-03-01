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
    acquire: js.Function0[scala.Unit],
    addDataEditorListener: js.Function1[XDataEditorListener, scala.Unit],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDataEditorListener: js.Function1[XDataEditorListener, scala.Unit],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    show: js.Function0[scala.Unit]
  ): XDataEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDataEditorListener")(addDataEditorListener)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDataEditorListener")(removeDataEditorListener)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[XDataEditor]
  }
}

