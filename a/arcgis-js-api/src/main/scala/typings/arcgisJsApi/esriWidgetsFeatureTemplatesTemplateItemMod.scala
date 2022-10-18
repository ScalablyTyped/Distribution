package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TemplateItem
import typings.arcgisJsApi.esri.TemplateItemConstructor
import typings.arcgisJsApi.esri.TemplateItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTemplatesTemplateItemMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates/TemplateItem", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TemplateItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates/TemplateItem", JSImport.Namespace)
  @js.native
  /**
    * The item displayed within the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html)
    */
  open class Class ()
    extends StObject
       with TemplateItem {
    def this(properties: TemplateItemProperties) = this()
  }
  
  type _To = js.Object & TemplateItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTemplatesTemplateItemMod.foo` */
  override def _to: js.Object & TemplateItemConstructor = ^
}
