package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the internal structure of a configurable user interface element.
  *
  * No assumption is made about any graphical representation: You could have a menu or a toolbar working with the same {@link UIElementSettings} although
  * limitations based on the real user interface element may be visible.
  * @since OOo 2.0
  */
trait UIElementSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleComponentFactory {
  /**
    * determine an optional user interface name of the user interface element.
    *
    * A toolbar can show a its user interface name on the window title, when it is in floating mode.
    */
  var UIName: java.lang.String
}

object UIElementSettings {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    UIName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    createInstanceWithArgumentsAndContext: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceWithContext: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): UIElementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("UIName")(UIName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createInstanceWithArgumentsAndContext")(createInstanceWithArgumentsAndContext)
    __obj.updateDynamic("createInstanceWithContext")(createInstanceWithContext)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[UIElementSettings]
  }
}

