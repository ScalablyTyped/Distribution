package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ComboBoxInput
import typings.arcgisJsApi.esri.ComboBoxInputConstructor
import typings.arcgisJsApi.esri.ComboBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboBoxInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/ComboBoxInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ComboBoxInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/ComboBoxInput", JSImport.Namespace)
  @js.native
  /**
    * The `ComboBoxInput` class defines the desired user interface for a combo box  group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html)
    */
  open class Class ()
    extends StObject
       with ComboBoxInput {
    def this(properties: ComboBoxInputProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ComboBoxInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `comboBoxInputMod.foo` */
  override def _to: js.Object & ComboBoxInputConstructor = ^
}
