package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to retrieve the user interface configuration manager related to an object.
  * @since OOo 2.0
  */
trait XUIConfigurationManagerSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  val UIConfigurationManager: XUIConfigurationManager
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  def getUIConfigurationManager(): XUIConfigurationManager
}

object XUIConfigurationManagerSupplier {
  @scala.inline
  def apply(
    UIConfigurationManager: XUIConfigurationManager,
    acquire: js.Function0[scala.Unit],
    getUIConfigurationManager: js.Function0[XUIConfigurationManager],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("UIConfigurationManager")(UIConfigurationManager)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getUIConfigurationManager")(getUIConfigurationManager)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUIConfigurationManagerSupplier]
  }
}

