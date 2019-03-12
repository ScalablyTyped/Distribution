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
    acquire: () => scala.Unit,
    createInstanceWithArgumentsAndContext: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceWithContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): UIElementSettings = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, UIName = UIName, acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction2(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction1(createInstanceWithContext), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[UIElementSettings]
  }
}

