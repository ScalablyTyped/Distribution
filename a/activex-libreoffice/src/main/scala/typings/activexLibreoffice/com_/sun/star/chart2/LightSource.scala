package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.drawing.Direction3D
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
    val __obj = js.Dynamic.literal(aDirection = aDirection.asInstanceOf[js.Any], bIsEnabled = bIsEnabled.asInstanceOf[js.Any], bSpecular = bSpecular.asInstanceOf[js.Any], nDiffuseColor = nDiffuseColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSource]
  }
}

