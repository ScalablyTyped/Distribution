package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RadioButtonsInput
import typings.arcgisJsApi.esri.RadioButtonsInputConstructor
import typings.arcgisJsApi.esri.RadioButtonsInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonsInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/RadioButtonsInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RadioButtonsInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/RadioButtonsInput", JSImport.Namespace)
  @js.native
  /**
    * The `RadioButtonsInput` class defines the desired user interface for a radio button group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html)
    */
  open class Class ()
    extends StObject
       with RadioButtonsInput {
    def this(properties: RadioButtonsInputProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RadioButtonsInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `radioButtonsInputMod.foo` */
  override def _to: js.Object & RadioButtonsInputConstructor = ^
}
