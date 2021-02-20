package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating popup templates to be set on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html)
  */
@js.native
trait templates extends StObject {
  
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
  implicit class templatesMutableBuilder[Self <: templates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTemplates(value: templatesGetTemplatesParams => js.Promise[Templates_]): Self = StObject.set(x, "getTemplates", js.Any.fromFunction1(value))
  }
}
