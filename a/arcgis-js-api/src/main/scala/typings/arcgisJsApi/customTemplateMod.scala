package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CustomTemplate
import typings.arcgisJsApi.esri.CustomTemplateConstructor
import typings.arcgisJsApi.esri.CustomTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customTemplateMod extends Shortcut {
  
  @JSImport("esri/widgets/Print/CustomTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CustomTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Print/CustomTemplate", JSImport.Namespace)
  @js.native
  /**
    * Defines the custom layout template options used by the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html)
    */
  open class Class ()
    extends StObject
       with CustomTemplate {
    def this(properties: CustomTemplateProperties) = this()
  }
  
  type _To = js.Object & CustomTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `customTemplateMod.foo` */
  override def _to: js.Object & CustomTemplateConstructor = ^
}
