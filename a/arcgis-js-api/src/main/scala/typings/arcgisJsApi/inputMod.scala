package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Input
import typings.arcgisJsApi.esri.InputConstructor
import typings.arcgisJsApi.esri.InputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Object & InputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/Input", JSImport.Namespace)
  @js.native
  /**
    * Form element inputs define the input user interface to use for a [field element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) specified in a feature layer's [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-Input.html)
    */
  class Class ()
    extends StObject
       with Input {
    def this(properties: InputProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & InputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `inputMod.foo` */
  override def _to: js.Object & InputConstructor = ^
}
