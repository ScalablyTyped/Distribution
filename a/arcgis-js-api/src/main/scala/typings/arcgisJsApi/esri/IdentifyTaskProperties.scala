package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifyTaskProperties extends TaskProperties {
  /**
    * Specify the geodatabase version to search. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
}

object IdentifyTaskProperties {
  @scala.inline
  def apply(): IdentifyTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyTaskProperties]
  }
  @scala.inline
  implicit class IdentifyTaskPropertiesOps[Self <: IdentifyTaskProperties] (val x: Self) extends AnyVal {
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
    def setGdbVersion(value: String): Self = this.set("gdbVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGdbVersion: Self = this.set("gdbVersion", js.undefined)
  }
  
}

