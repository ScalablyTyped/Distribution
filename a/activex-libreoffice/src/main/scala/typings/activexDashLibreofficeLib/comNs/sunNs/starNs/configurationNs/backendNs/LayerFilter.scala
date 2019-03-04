package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a filtered version of a configuration data {@link Layer} .
  *
  * A layer filter wraps a source {@link XLayer} object and provides access to a filtered version of its data. The data read from the filter usually is
  * produced from the source data by adding and removing elements or modifying values.
  * @see com.sun.star.configuration.backend.DataImporter Service that supports applying a LayerFilter to imported data.
  * @since OOo 2.0
  */
trait LayerFilter
  extends XLayer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object LayerFilter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readData: js.Function1[XLayerHandler, scala.Unit],
    release: js.Function0[scala.Unit]
  ): LayerFilter = {
    val __obj = js.Dynamic.literal(acquire = acquire, initialize = initialize, queryInterface = queryInterface, readData = readData, release = release)
  
    __obj.asInstanceOf[LayerFilter]
  }
}

