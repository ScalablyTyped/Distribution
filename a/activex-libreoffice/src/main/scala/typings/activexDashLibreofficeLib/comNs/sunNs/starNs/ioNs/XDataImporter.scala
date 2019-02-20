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

