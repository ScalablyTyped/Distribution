package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProperties extends js.Object {
  /**
    * The [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for data requests. These options can also be controlled through the `requestOptions` method parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Task.html#requestOptions)
    */
  var requestOptions: js.UndefOr[js.Any] = js.native
  /**
    * The ArcGIS Server REST service URL (usually of a Feature Service Layer or Map Service Layer) for use in a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Task.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object TaskProperties {
  @scala.inline
  def apply(): TaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskProperties]
  }
  @scala.inline
  implicit class TaskPropertiesOps[Self <: TaskProperties] (val x: Self) extends AnyVal {
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
    def setRequestOptions(value: js.Any): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

