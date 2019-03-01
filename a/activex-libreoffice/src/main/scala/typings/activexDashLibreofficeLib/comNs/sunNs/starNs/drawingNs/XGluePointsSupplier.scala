package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a container of {@link GluePoint2} . */
trait XGluePointsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a container of {@link GluePoint2} structs. */
  val GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** @returns a container of {@link GluePoint2} structs. */
  def getGluePoints(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
}

object XGluePointsSupplier {
  @scala.inline
  def apply(
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    acquire: js.Function0[scala.Unit],
    getGluePoints: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGluePointsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GluePoints")(GluePoints)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getGluePoints")(getGluePoints)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGluePointsSupplier]
  }
}

