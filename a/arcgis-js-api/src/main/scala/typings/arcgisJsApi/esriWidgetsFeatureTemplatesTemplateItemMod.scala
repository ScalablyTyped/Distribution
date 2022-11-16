package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TemplateItem
import typings.arcgisJsApi.esri.TemplateItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsFeatureTemplatesTemplateItemMod {
  
  @JSImport("esri/widgets/FeatureTemplates/TemplateItem", JSImport.Namespace)
  @js.native
  /**
    * The item displayed within the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html)
    */
  open class ^ ()
    extends StObject
       with TemplateItem {
    def this(properties: TemplateItemProperties) = this()
  }
  @JSImport("esri/widgets/FeatureTemplates/TemplateItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fetches the thumbnail used to display the template item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#fetchThumbnail)
    */
  inline def fetchThumbnail(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchThumbnail")().asInstanceOf[js.Promise[Any]]
}
