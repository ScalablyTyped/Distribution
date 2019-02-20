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

