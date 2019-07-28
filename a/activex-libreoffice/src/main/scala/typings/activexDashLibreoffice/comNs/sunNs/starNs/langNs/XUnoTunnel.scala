package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to tunnel UNO. This means providing access to data or something else, which is not specified by UNO-IDL.
  *
  *
  *
  * Common usage: Getting a C++ object pointer in the same process, thus to use an implementation directly, most often because of a design flaw.
  */
trait XUnoTunnel extends XInterface {
  /**
    * Call this method to get something which is not specified in UNO, e.g. an address to some C++ object.
    * @param aIdentifier identifier
    * @returns something
    */
  def getSomething(aIdentifier: SeqEquiv[Double]): Double
}

object XUnoTunnel {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getSomething: SeqEquiv[Double] => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUnoTunnel = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSomething = js.Any.fromFunction1(getSomething), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUnoTunnel]
  }
}

