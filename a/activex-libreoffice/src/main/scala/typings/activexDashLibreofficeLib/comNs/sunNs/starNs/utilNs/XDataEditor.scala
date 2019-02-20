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

