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
    SupportedServiceNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addStatusListener: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStatusListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      scala.Unit
    ],
    dispatch: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    getImplementationName: js.Function0[java.lang.String],
    getSupportedServiceNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    keyPressed: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, scala.Boolean],
    keyReleased: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, scala.Boolean],
    mouseDragged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    mouseMoved: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    mousePressed: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    mouseReleased: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeStatusListener: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStatusListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      scala.Unit
    ],
    selectionChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    supportsService: js.Function1[java.lang.String, scala.Boolean]
  ): XSelectionFunction = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName, SupportedServiceNames = SupportedServiceNames, acquire = acquire, addEventListener = addEventListener, addStatusListener = addStatusListener, dispatch = dispatch, dispose = dispose, disposing = disposing, getImplementationName = getImplementationName, getSupportedServiceNames = getSupportedServiceNames, keyPressed = keyPressed, keyReleased = keyReleased, mouseDragged = mouseDragged, mouseMoved = mouseMoved, mousePressed = mousePressed, mouseReleased = mouseReleased, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeStatusListener = removeStatusListener, selectionChanged = selectionChanged, supportsService = supportsService)
  
    __obj.asInstanceOf[XSelectionFunction]
  }
}

