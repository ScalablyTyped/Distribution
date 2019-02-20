package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to produce instances of an implementation of a service specification.
  *
  * This interface is deprecated. Please use {@link XSingleComponentFactory} .
  * @deprecated Deprecated
  * @see XInitialization
  */
trait XSingleServiceFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an instance of a service implementation.
    * @returns service instance
    */
  def createInstance(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * Creates an instance of a service implementation initialized with some arguments.
    * @param aArguments arguments passed to implementation
    * @returns service instance
    */
  def createInstanceWithArguments(aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

