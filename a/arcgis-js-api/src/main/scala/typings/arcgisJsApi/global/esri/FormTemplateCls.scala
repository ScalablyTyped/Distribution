package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FormTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.FormTemplate")
@js.native
/**
  * A FormTemplate formats and defines the content of a [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html)
  */
class FormTemplateCls ()
  extends StObject
     with typings.arcgisJsApi.esri.FormTemplate {
  def this(properties: FormTemplateProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
