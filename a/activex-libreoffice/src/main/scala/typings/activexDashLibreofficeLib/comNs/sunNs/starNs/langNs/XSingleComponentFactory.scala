package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to create instances of an implementation of a service specification.
  * @see XInitialization
  */
trait XSingleComponentFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an instance of a component and initializes the new instance with the given arguments and context.
    * @param Arguments arguments passed to implementation
    * @param Context the instance gets its deployment values from this
    * @returns component instance
    */
  def createInstanceWithArgumentsAndContext(
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * Creates an instance of a service implementation.
    * @param Context the instance gets its deployment values from this
    * @returns component instance
    */
  def createInstanceWithContext(Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

