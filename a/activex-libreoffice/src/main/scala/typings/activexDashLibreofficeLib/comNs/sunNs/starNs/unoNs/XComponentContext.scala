package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component context to be passed to a component via {@link com.sun.star.lang.XSingleComponentFactory} . Arbitrary values (e.g. deployment values) can be
  * retrieved from the context.
  */
trait XComponentContext extends XInterface {
  /**
    * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
    * because the service manager is used very often.
    * @returns service manager; throws {@link DeploymentException} in case service manager is null
    */
  val ServiceManager: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory
  /**
    * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
    * because the service manager is used very often.
    * @returns service manager; throws {@link DeploymentException} in case service manager is null
    */
  def getServiceManager(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory
  /**
    * Gets a value from the context.
    * @param Name name of value
    * @returns value
    */
  def getValueByName(Name: java.lang.String): js.Any
}

object XComponentContext {
  @scala.inline
  def apply(
    ServiceManager: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory,
    acquire: js.Function0[scala.Unit],
    getServiceManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory],
    getValueByName: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XComponentContext = {
    val __obj = js.Dynamic.literal(ServiceManager = ServiceManager, acquire = acquire, getServiceManager = getServiceManager, getValueByName = getValueByName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XComponentContext]
  }
}

