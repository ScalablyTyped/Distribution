package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TemplateItemGroup
import typings.arcgisJsApi.esri.TemplateItemGroupConstructor
import typings.arcgisJsApi.esri.TemplateItemGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateItemGroupMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates/TemplateItemGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TemplateItemGroupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates/TemplateItemGroup", JSImport.Namespace)
  @js.native
  /**
    * This is a read-only support class that represents a group of items displayed within the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItemGroup.html)
    */
  open class Class ()
    extends StObject
       with TemplateItemGroup {
    def this(properties: TemplateItemGroupProperties) = this()
  }
  
  type _To = js.Object & TemplateItemGroupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `templateItemGroupMod.foo` */
  override def _to: js.Object & TemplateItemGroupConstructor = ^
}
