package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to import data from a data source into a component.
  *
  * Importer objects are registered for specific components and data types.
  */
trait XDataImporter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** cancels the import process. */
  def cancel(): scala.Unit
  /** imports data for a component from an active data source. */
  def importData(
    aActiveSource: XActiveDataSource,
    Component: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    aListener: XDataTransferEventListener
  ): scala.Unit
}

object XDataImporter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    importData: js.Function3[
      XActiveDataSource, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, 
      XDataTransferEventListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataImporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("importData")(importData)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataImporter]
  }
}

