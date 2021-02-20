package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskProperties extends StObject {
  
  /**
    * The [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for data requests.
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
  implicit class TaskPropertiesMutableBuilder[Self <: TaskProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestOptions(value: js.Any): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
