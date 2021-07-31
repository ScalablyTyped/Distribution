package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FormTemplate
import typings.arcgisJsApi.esri.FormTemplateConstructor
import typings.arcgisJsApi.esri.FormTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formTemplateMod extends Shortcut {
  
  @JSImport("esri/form/FormTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FormTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/FormTemplate", JSImport.Namespace)
  @js.native
  /**
    * A FormTemplate formats and defines the content of a [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html)
    */
  class Class ()
    extends StObject
       with FormTemplate {
    def this(properties: FormTemplateProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & FormTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `formTemplateMod.foo` */
  override def _to: js.Object & FormTemplateConstructor = ^
}
