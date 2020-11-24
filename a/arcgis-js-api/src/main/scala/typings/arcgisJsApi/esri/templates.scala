package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating popup templates to be set on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html)
  */
@js.native
trait templates extends js.Object {
  
  /**
    * Returns one or more suggested [popupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for a given layer based on its renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#getTemplates)
    */
  def getTemplates(params: templatesGetTemplatesParams): js.Promise[Templates_] = js.native
}
object templates {
  
  @scala.inline
  def apply(getTemplates: templatesGetTemplatesParams => js.Promise[Templates_]): templates = {
    val __obj = js.Dynamic.literal(getTemplates = js.Any.fromFunction1(getTemplates))
    __obj.asInstanceOf[templates]
  }
  
  @scala.inline
  implicit class templatesOps[Self <: templates] (val x: Self) extends AnyVal {
    
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
    def setGetTemplates(value: templatesGetTemplatesParams => js.Promise[Templates_]): Self = this.set("getTemplates", js.Any.fromFunction1(value))
  }
}
