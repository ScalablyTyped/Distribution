package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * imports data into a configuration layer by copying over existing data.
  * @since OOo 1.1.2
  */
trait CopyImporter extends Importer

object CopyImporter {
  @scala.inline
  def apply(
    TargetBackend: XBackend,
    acquire: () => scala.Unit,
    getTargetBackend: () => XBackend,
    importLayer: XLayer => scala.Unit,
    importLayerForEntity: (XLayer, java.lang.String) => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTargetBackend: XBackend => scala.Unit
  ): CopyImporter = {
    val __obj = js.Dynamic.literal(TargetBackend = TargetBackend, acquire = js.Any.fromFunction0(acquire), getTargetBackend = js.Any.fromFunction0(getTargetBackend), importLayer = js.Any.fromFunction1(importLayer), importLayerForEntity = js.Any.fromFunction2(importLayerForEntity), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTargetBackend = js.Any.fromFunction1(setTargetBackend))
  
    __obj.asInstanceOf[CopyImporter]
  }
}

