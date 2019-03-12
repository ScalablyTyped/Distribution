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
    acquire: () => scala.Unit,
    getGluePoints: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XGluePointsSupplier = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints, acquire = js.Any.fromFunction0(acquire), getGluePoints = js.Any.fromFunction0(getGluePoints), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGluePointsSupplier]
  }
}

