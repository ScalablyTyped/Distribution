package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTaskProperties extends TaskProperties {
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#updateDelay)
    *
    * @default 1000
    */
  var updateDelay: js.UndefOr[Double] = js.native
}

object PrintTaskProperties {
  @scala.inline
  def apply(): PrintTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTaskProperties]
  }
  @scala.inline
  implicit class PrintTaskPropertiesOps[Self <: PrintTaskProperties] (val x: Self) extends AnyVal {
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
    def setUpdateDelay(value: Double): Self = this.set("updateDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDelay: Self = this.set("updateDelay", js.undefined)
  }
  
}

