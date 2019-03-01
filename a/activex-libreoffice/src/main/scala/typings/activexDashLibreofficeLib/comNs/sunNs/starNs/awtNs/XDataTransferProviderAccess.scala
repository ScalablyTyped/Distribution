package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface extends the {@link XToolkit} interface with clipboard and drag-and-drop support. */
trait XDataTransferProviderAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the specified clipboard.
    * @param clipboardName the name of the clipboard to return. If an empty string is passed in, the default clipboard is returned.
    * @returns the specified clipboard (if available).
    */
  def getClipboard(clipboardName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.XClipboard
  /**
    * returns the drag gesture recognizer of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drag gesture recognizer.
    */
  def getDragGestureRecognizer(window: XWindow): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragGestureRecognizer
  /**
    * returns the drag source of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drag source.
    */
  def getDragSource(window: XWindow): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragSource
  /**
    * returns the drop target of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drop target.
    */
  def getDropTarget(window: XWindow): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDropTarget
}

object XDataTransferProviderAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getClipboard: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.XClipboard
    ],
    getDragGestureRecognizer: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragGestureRecognizer
    ],
    getDragSource: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragSource
    ],
    getDropTarget: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDropTarget
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataTransferProviderAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getClipboard")(getClipboard)
    __obj.updateDynamic("getDragGestureRecognizer")(getDragGestureRecognizer)
    __obj.updateDynamic("getDragSource")(getDragSource)
    __obj.updateDynamic("getDropTarget")(getDropTarget)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataTransferProviderAccess]
  }
}

