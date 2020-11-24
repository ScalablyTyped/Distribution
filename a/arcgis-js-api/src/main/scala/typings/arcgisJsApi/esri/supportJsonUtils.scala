package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait supportJsonUtils extends js.Object {
  
  /**
    * Creates a new instance of an appropriate [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-jsonUtils.html#fromJSON)
    */
  def fromJSON(json: js.Any): Renderer = js.native
}
object supportJsonUtils {
  
  @scala.inline
  def apply(fromJSON: js.Any => Renderer): supportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
    __obj.asInstanceOf[supportJsonUtils]
  }
  
  @scala.inline
  implicit class supportJsonUtilsOps[Self <: supportJsonUtils] (val x: Self) extends AnyVal {
    
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
    def setFromJSON(value: js.Any => Renderer): Self = this.set("fromJSON", js.Any.fromFunction1(value))
  }
}
