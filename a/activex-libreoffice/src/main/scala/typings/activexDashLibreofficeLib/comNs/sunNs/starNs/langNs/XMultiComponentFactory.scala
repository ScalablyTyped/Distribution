package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface for creating component instances giving a context from which to retrieve deployment values.
  * @see XInitialization
  */
trait XMultiComponentFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  val AvailableServiceNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Creates an instance of a component which supports the services specified by the factory, and initializes the new instance with the given arguments and
    * context.
    * @param ServiceSpecifier service name
    * @param Arguments arguments
    * @param Context context the component instance gets its deployment values from
    * @returns component instance
    */
  def createInstanceWithArgumentsAndContext(
    ServiceSpecifier: java.lang.String,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * Creates an instance of a component which supports the services specified by the factory.
    * @param aServiceSpecifier service name
    * @param Context context the component instance gets its deployment values from
    * @returns component instance
    */
  def createInstanceWithContext(
    aServiceSpecifier: java.lang.String,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  def getAvailableServiceNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

