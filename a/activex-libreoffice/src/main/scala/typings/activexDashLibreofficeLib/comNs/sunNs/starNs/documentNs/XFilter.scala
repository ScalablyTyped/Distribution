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
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFilter]
  }
}

