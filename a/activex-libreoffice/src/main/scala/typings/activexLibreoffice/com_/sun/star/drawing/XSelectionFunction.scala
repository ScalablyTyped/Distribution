package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typings.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typings.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typings.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionHandler
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XStatusListener
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XServiceInfo
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName.asInstanceOf[js.Any], SupportedServiceNames = SupportedServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addStatusListener = js.Any.fromFunction2(addStatusListener), dispatch = js.Any.fromFunction2(dispatch), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), mouseDragged = js.Any.fromFunction1(mouseDragged), mouseMoved = js.Any.fromFunction1(mouseMoved), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeStatusListener = js.Any.fromFunction2(removeStatusListener), selectionChanged = js.Any.fromFunction1(selectionChanged), supportsService = js.Any.fromFunction1(supportsService))
    __obj.asInstanceOf[XSelectionFunction]
  }
}
