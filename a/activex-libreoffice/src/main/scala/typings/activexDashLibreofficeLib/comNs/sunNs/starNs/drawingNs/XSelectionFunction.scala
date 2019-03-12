package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSelectionFunction
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceInfo
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener

object XSelectionFunction {
  @scala.inline
  def apply(
    ImplementationName: java.lang.String,
    SupportedServiceNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addStatusListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStatusListener, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL) => scala.Unit,
    dispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    dispose: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    getImplementationName: () => java.lang.String,
    getSupportedServiceNames: () => stdLib.SafeArray[java.lang.String],
    keyPressed: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent => scala.Boolean,
    keyReleased: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent => scala.Boolean,
    mouseDragged: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent => scala.Boolean,
    mouseMoved: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent => scala.Boolean,
    mousePressed: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent => scala.Boolean,
    mouseReleased: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeStatusListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStatusListener, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL) => scala.Unit,
    selectionChanged: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    supportsService: java.lang.String => scala.Boolean
  ): XSelectionFunction = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName, SupportedServiceNames = SupportedServiceNames, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addStatusListener = js.Any.fromFunction2(addStatusListener), dispatch = js.Any.fromFunction2(dispatch), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), mouseDragged = js.Any.fromFunction1(mouseDragged), mouseMoved = js.Any.fromFunction1(mouseMoved), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeStatusListener = js.Any.fromFunction2(removeStatusListener), selectionChanged = js.Any.fromFunction1(selectionChanged), supportsService = js.Any.fromFunction1(supportsService))
  
    __obj.asInstanceOf[XSelectionFunction]
  }
}

