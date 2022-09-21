package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DateTimePickerInput
import typings.arcgisJsApi.esri.DateTimePickerInputConstructor
import typings.arcgisJsApi.esri.DateTimePickerInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePickerInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/DateTimePickerInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DateTimePickerInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/DateTimePickerInput", JSImport.Namespace)
  @js.native
  /**
    * The `DateTimePickerInput` class defines the desired user interface for editing date fields in a form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html)
    */
  open class Class ()
    extends StObject
       with DateTimePickerInput {
    def this(properties: DateTimePickerInputProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DateTimePickerInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dateTimePickerInputMod.foo` */
  override def _to: js.Object & DateTimePickerInputConstructor = ^
}
