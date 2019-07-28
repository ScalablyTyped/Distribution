package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.Direction3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightSource extends js.Object {
  /** the direction into which the light-source points */
  var aDirection: Direction3D
  var bIsEnabled: Boolean
  /** When `TRUE` , the specularity of material is taken into account when lighting an object. */
  var bSpecular: Boolean
  /** the light source's color */
  var nDiffuseColor: Double
}

object LightSource {
  @scala.inline
  def apply(aDirection: Direction3D, bIsEnabled: Boolean, bSpecular: Boolean, nDiffuseColor: Double): LightSource = {
    val __obj = js.Dynamic.literal(aDirection = aDirection, bIsEnabled = bIsEnabled, bSpecular = bSpecular, nDiffuseColor = nDiffuseColor)
  
    __obj.asInstanceOf[LightSource]
  }
}

