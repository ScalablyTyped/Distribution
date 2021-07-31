package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.InputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Input")
@js.native
/**
  * Form element inputs define the input user interface to use for a [field element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) specified in a feature layer's [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-Input.html)
  */
class InputCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Input {
  def this(properties: InputProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
