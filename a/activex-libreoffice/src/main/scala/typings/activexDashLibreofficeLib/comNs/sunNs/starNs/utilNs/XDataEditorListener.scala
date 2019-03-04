package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive status change events from an {@link XDataEditor} . */
trait XDataEditorListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** is called when the state of a connected {@link XDataEditor} changes. */
  def updateDataEditorState(event: DataEditorEvent): scala.Unit
}

object XDataEditorListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateDataEditorState: js.Function1[DataEditorEvent, scala.Unit]
  ): XDataEditorListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, updateDataEditorState = updateDataEditorState)
  
    __obj.asInstanceOf[XDataEditorListener]
  }
}

