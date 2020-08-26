package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.drawing.Direction3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightSource extends js.Object {
  /** the direction into which the light-source points */
  var aDirection: Direction3D = js.native
  var bIsEnabled: Boolean = js.native
  /** When `TRUE` , the specularity of material is taken into account when lighting an object. */
  var bSpecular: Boolean = js.native
  /** the light source's color */
  var nDiffuseColor: Double = js.native
}

object LightSource {
  @scala.inline
  def apply(aDirection: Direction3D, bIsEnabled: Boolean, bSpecular: Boolean, nDiffuseColor: Double): LightSource = {
    val __obj = js.Dynamic.literal(aDirection = aDirection.asInstanceOf[js.Any], bIsEnabled = bIsEnabled.asInstanceOf[js.Any], bSpecular = bSpecular.asInstanceOf[js.Any], nDiffuseColor = nDiffuseColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSource]
  }
  @scala.inline
  implicit class LightSourceOps[Self <: LightSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setADirection(value: Direction3D): Self = this.set("aDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIsEnabled(value: Boolean): Self = this.set("bIsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBSpecular(value: Boolean): Self = this.set("bSpecular", value.asInstanceOf[js.Any])
    @scala.inline
    def setNDiffuseColor(value: Double): Self = this.set("nDiffuseColor", value.asInstanceOf[js.Any])
  }
  
}

