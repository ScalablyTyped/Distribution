package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style service {@link XUIElementFactoryManager} .
  * @since LibreOffice 4.1
  */
trait XUIElementFactoryManager
  extends XUIElementFactory
     with XUIElementFactoryRegistration

object XUIElementFactoryManager {
  @scala.inline
  def apply(
    RegisteredFactories: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    acquire: js.Function0[scala.Unit],
    createUIElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XUIElement
    ],
    deregisterFactory: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    getFactory: js.Function2[java.lang.String, java.lang.String, XUIElementFactory],
    getRegisteredFactories: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerFactory: js.Function4[java.lang.String, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XUIElementFactoryManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RegisteredFactories")(RegisteredFactories)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createUIElement")(createUIElement)
    __obj.updateDynamic("deregisterFactory")(deregisterFactory)
    __obj.updateDynamic("getFactory")(getFactory)
    __obj.updateDynamic("getRegisteredFactories")(getRegisteredFactories)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerFactory")(registerFactory)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUIElementFactoryManager]
  }
}

