package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TemplateItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TemplateItem")
@js.native
/**
  * The item displayed within the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html)
  */
open class TemplateItem ()
  extends StObject
     with typings.arcgisJsApi.esri.TemplateItem {
  def this(properties: TemplateItemProperties) = this()
}
/* static members */
object TemplateItem {
  
  @JSGlobal("__esri.TemplateItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fetches the thumbnail used to display the template item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#fetchThumbnail)
    */
  inline def fetchThumbnail(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchThumbnail")().asInstanceOf[js.Promise[Any]]
}
