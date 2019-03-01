package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a user interface element.
  *
  * A user interface element consists of a unique identifier and a type specifier. It provides an interface to retrieve a special purpose interface which
  * depends on the specific user interface element type. Every user interface must be initialized before it can be used.
  * @since OOo 2.0
  */
trait UIElement
  extends XUIElement
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XUpdatable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object UIElement {
  @scala.inline
  def apply(
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    RealInterface: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ResourceURL: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getRealInterface: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    update: js.Function0[scala.Unit]
  ): UIElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("RealInterface")(RealInterface)
    __obj.updateDynamic("ResourceURL")(ResourceURL)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getRealInterface")(getRealInterface)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[UIElement]
  }
}

