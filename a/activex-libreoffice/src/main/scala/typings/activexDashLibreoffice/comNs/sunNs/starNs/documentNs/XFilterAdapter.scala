package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an interface that can be used to link a filter to the {@link FilterAdapter}
  * @since OOo 1.1.2
  * @throws com::sun::star::uno::RuntimeException
  */
trait XFilterAdapter extends XInterface {
  def convert(
    xml: XInputStream,
    device: XOutputStream,
    convertToOffice: Boolean,
    pluginUrl: String,
    fileName: String
  ): Unit
}

object XFilterAdapter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    convert: (XInputStream, XOutputStream, Boolean, String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFilterAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convert = js.Any.fromFunction5(convert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFilterAdapter]
  }
}

