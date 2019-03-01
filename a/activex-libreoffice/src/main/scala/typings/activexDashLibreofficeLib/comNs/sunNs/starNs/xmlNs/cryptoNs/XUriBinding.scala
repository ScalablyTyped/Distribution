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
    acquire: js.Function0[scala.Unit],
    getUriBinding: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setUriBinding: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ]
  ): XUriBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getUriBinding")(getUriBinding)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setUriBinding")(setUriBinding)
    __obj.asInstanceOf[XUriBinding]
  }
}

