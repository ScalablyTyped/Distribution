package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an interface that can be used to link a filter to the {@link FilterAdapter}
  * @since OOo 1.1.2
  * @throws com::sun::star::uno::RuntimeException
  */
trait XFilterAdapter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def convert(
    xml: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    device: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    convertToOffice: scala.Boolean,
    pluginUrl: java.lang.String,
    fileName: java.lang.String
  ): scala.Unit
}

