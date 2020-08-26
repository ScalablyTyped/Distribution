package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartColorRampProperties extends ColorRampProperties {
  /**
    * Define an array of algorithmic color ramps used to generate the multi part ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#colorRamps)
    */
  var colorRamps: js.UndefOr[js.Array[AlgorithmicColorRampProperties]] = js.native
}

object MultipartColorRampProperties {
  @scala.inline
  def apply(): MultipartColorRampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartColorRampProperties]
  }
  @scala.inline
  implicit class MultipartColorRampPropertiesOps[Self <: MultipartColorRampProperties] (val x: Self) extends AnyVal {
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
    def setColorRampsVarargs(value: AlgorithmicColorRampProperties*): Self = this.set("colorRamps", js.Array(value :_*))
    @scala.inline
    def setColorRamps(value: js.Array[AlgorithmicColorRampProperties]): Self = this.set("colorRamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRamps: Self = this.set("colorRamps", js.undefined)
  }
  
}

