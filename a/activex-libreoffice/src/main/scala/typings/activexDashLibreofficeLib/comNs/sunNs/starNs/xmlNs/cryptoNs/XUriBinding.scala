package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Uri Binding.
  *
  * This interface is used to dynamically bind a uri with a XInputStream interface.
  */
trait XUriBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the XInputStream interface for a uri.
    * @param uri the uri whose binding is to get
    * @returns the XInputStream bound with the uri
    */
  def getUriBinding(uri: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Sets the XInputStream interface for a uri.
    * @param uri the uri to bind
    * @param InputStream the XInputStream to be bound
    */
  def setUriBinding(uri: java.lang.String, InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
}

object XUriBinding {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getUriBinding: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setUriBinding: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit
  ): XUriBinding = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUriBinding = js.Any.fromFunction1(getUriBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setUriBinding = js.Any.fromFunction2(setUriBinding))
  
    __obj.asInstanceOf[XUriBinding]
  }
}

