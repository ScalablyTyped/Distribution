package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be used to identify office modules.
  * @since OOo 2.0
  */
trait XModuleManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * This identifier can then be used at the service {@link ModuleManager} to get more information about this module.
    *
    * For identification the interface {@link com.sun.star.lang.XServiceInfo} is requested on the given module. Because all module service registrations
    * must be unique this value can be queried and checked against the configuration.
    *
    * Since OOo 2.3.0 also the optional interface {@link XModule} will be used. If its exists it will be preferred.
    * @param Module Possible objects for this parameter can be the following one: **com::sun::star::frame::XFrame**;  A frame contains (against a component wi
    * @returns An identifier for the given module. Note: This value varies every time. Error will be transported by thrown exceptions!
    * @throws com::sun::star::lang::IllegalArgumentException if the parameter Module is: an empty oneor does not provide one of the needed interface {@link XFr
    * @throws UnknownModuleException if the given module could not be identified. Note: If the module represent a {@link XFrame} instance with does not contain
    */
  def identify(Module: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): java.lang.String
}

object XModuleManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    identify: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XModuleManager = {
    val __obj = js.Dynamic.literal(acquire = acquire, identify = identify, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XModuleManager]
  }
}

