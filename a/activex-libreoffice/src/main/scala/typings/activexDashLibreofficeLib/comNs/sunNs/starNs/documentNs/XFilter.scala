package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to filter documents
  *
  * This interface will be used by service {@link ImportFilter} or {@link ExportFilter} to support loading/saving of documents in different formats. The
  * target/source of such filter operations must be known **before** filtering will be started. (see {@link XImporter} and {@link XExporter} too)
  * Otherwise this interface can't work right.
  * @see ImportFilter
  * @see ExportFilter
  * @see XImporter
  * @see XExporter
  */
trait XFilter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** cancel the process. */
  def cancel(): scala.Unit
  /**
    * filter the document.
    *
    * The given {@link MediaDescriptor} holds all necessary information about the document.
    *
    * Don't hold hard references to the descriptor items. You must copy needed information! Otherwise we couldn't destroy (for example) an existing input
    * stream!
    * @param aDescriptor the {@link MediaDescriptor} describing the respective document.
    * @returns a boolean value indicating whether the filter operation was successful or not.
    */
  def filter(
    aDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Boolean
}

object XFilter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFilter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFilter]
  }
}

