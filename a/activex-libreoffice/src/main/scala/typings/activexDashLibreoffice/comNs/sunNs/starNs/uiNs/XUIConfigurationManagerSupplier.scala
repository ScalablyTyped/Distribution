package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to retrieve the user interface configuration manager related to an object.
  * @since OOo 2.0
  */
trait XUIConfigurationManagerSupplier extends XInterface {
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
    acquire: () => Unit,
    getUIConfigurationManager: () => XUIConfigurationManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal(UIConfigurationManager = UIConfigurationManager, acquire = js.Any.fromFunction0(acquire), getUIConfigurationManager = js.Any.fromFunction0(getUIConfigurationManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIConfigurationManagerSupplier]
  }
}

