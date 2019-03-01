package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * imports data into a configuration layer.
  *
  * The configuration changes are read from a {@link XLayer} and stored into a {@link Backend} .
  * @since OOo 1.1.2
  */
trait Importer
  extends XLayerImporter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object Importer {
  @scala.inline
  def apply(
    TargetBackend: XBackend,
    acquire: js.Function0[scala.Unit],
    getTargetBackend: js.Function0[XBackend],
    importLayer: js.Function1[XLayer, scala.Unit],
    importLayerForEntity: js.Function2[XLayer, java.lang.String, scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTargetBackend: js.Function1[XBackend, scala.Unit]
  ): Importer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TargetBackend")(TargetBackend)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTargetBackend")(getTargetBackend)
    __obj.updateDynamic("importLayer")(importLayer)
    __obj.updateDynamic("importLayerForEntity")(importLayerForEntity)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setTargetBackend")(setTargetBackend)
    __obj.asInstanceOf[Importer]
  }
}

