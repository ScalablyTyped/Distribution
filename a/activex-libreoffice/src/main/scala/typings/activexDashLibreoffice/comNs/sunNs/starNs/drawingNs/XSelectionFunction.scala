package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.KeyEvent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.MouseEvent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseMotionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XStatusListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XServiceInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSelectionFunction
  extends XKeyHandler
     with XComponent
     with XServiceInfo
     with XDispatch
     with XMouseClickHandler
     with XMouseMotionHandler
     with XSelectionChangeListener

object XSelectionFunction {
  @scala.inline
  def apply(
    ImplementationName: String,
    SupportedServiceNames: SafeArray[String],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addStatusListener: (XStatusListener, URL) => Unit,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Unit,
    dispose: () => Unit,
    disposing: EventObject => Unit,
    getImplementationName: () => String,
    getSupportedServiceNames: () => SafeArray[String],
    keyPressed: KeyEvent => Boolean,
    keyReleased: KeyEvent => Boolean,
    mouseDragged: MouseEvent => Boolean,
    mouseMoved: MouseEvent => Boolean,
    mousePressed: MouseEvent => Boolean,
    mouseReleased: MouseEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeStatusListener: (XStatusListener, URL) => Unit,
    selectionChanged: EventObject => Unit,
    supportsService: String => Boolean
  ): XSelectionFunction = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName, SupportedServiceNames = SupportedServiceNames, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addStatusListener = js.Any.fromFunction2(addStatusListener), dispatch = js.Any.fromFunction2(dispatch), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), mouseDragged = js.Any.fromFunction1(mouseDragged), mouseMoved = js.Any.fromFunction1(mouseMoved), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeStatusListener = js.Any.fromFunction2(removeStatusListener), selectionChanged = js.Any.fromFunction1(selectionChanged), supportsService = js.Any.fromFunction1(supportsService))
  
    __obj.asInstanceOf[XSelectionFunction]
  }
}

