package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be used to identify office modules.
  * @since OOo 2.0
  */
trait XModuleManager extends XInterface {
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
  def identify(Module: XInterface): String
}

object XModuleManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    identify: XInterface => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModuleManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), identify = js.Any.fromFunction1(identify), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModuleManager]
  }
}

