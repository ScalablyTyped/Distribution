package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightSource extends js.Object {
  /** the direction into which the light-source points */
  var aDirection: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Direction3D
  var bIsEnabled: scala.Boolean
  /** When `TRUE` , the specularity of material is taken into account when lighting an object. */
  var bSpecular: scala.Boolean
  /** the light source's color */
  var nDiffuseColor: scala.Double
}

object LightSource {
  @scala.inline
  def apply(
    aDirection: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Direction3D,
    bIsEnabled: scala.Boolean,
    bSpecular: scala.Boolean,
    nDiffuseColor: scala.Double
  ): LightSource = {
    val __obj = js.Dynamic.literal(aDirection = aDirection, bIsEnabled = bIsEnabled, bSpecular = bSpecular, nDiffuseColor = nDiffuseColor)
  
    __obj.asInstanceOf[LightSource]
  }
}

