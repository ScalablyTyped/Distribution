package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Uri Binding.
  *
  * This interface is used to dynamically bind a uri with a XInputStream interface.
  */
trait XUriBinding extends XInterface {
  /**
    * Gets the XInputStream interface for a uri.
    * @param uri the uri whose binding is to get
    * @returns the XInputStream bound with the uri
    */
  def getUriBinding(uri: String): XInputStream
  /**
    * Sets the XInputStream interface for a uri.
    * @param uri the uri to bind
    * @param InputStream the XInputStream to be bound
    */
  def setUriBinding(uri: String, InputStream: XInputStream): Unit
}

object XUriBinding {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getUriBinding: String => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setUriBinding: (String, XInputStream) => Unit
  ): XUriBinding = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUriBinding = js.Any.fromFunction1(getUriBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setUriBinding = js.Any.fromFunction2(setUriBinding))
  
    __obj.asInstanceOf[XUriBinding]
  }
}

