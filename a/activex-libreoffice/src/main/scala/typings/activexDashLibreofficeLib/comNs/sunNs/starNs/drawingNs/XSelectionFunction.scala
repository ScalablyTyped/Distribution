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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ImplementationName")(ImplementationName)
    __obj.updateDynamic("SupportedServiceNames")(SupportedServiceNames)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addStatusListener")(addStatusListener)
    __obj.updateDynamic("dispatch")(dispatch)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("getImplementationName")(getImplementationName)
    __obj.updateDynamic("getSupportedServiceNames")(getSupportedServiceNames)
    __obj.updateDynamic("keyPressed")(keyPressed)
    __obj.updateDynamic("keyReleased")(keyReleased)
    __obj.updateDynamic("mouseDragged")(mouseDragged)
    __obj.updateDynamic("mouseMoved")(mouseMoved)
    __obj.updateDynamic("mousePressed")(mousePressed)
    __obj.updateDynamic("mouseReleased")(mouseReleased)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeStatusListener")(removeStatusListener)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("supportsService")(supportsService)
    __obj.asInstanceOf[XSelectionFunction]
  }
}

