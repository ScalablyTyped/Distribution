package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SwitchInput
import typings.arcgisJsApi.esri.SwitchInputConstructor
import typings.arcgisJsApi.esri.SwitchInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/SwitchInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SwitchInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/SwitchInput", JSImport.Namespace)
  @js.native
  /**
    * The `SwitchInput` class defines the desired user interface for a binary switch or toggle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html)
    */
  open class Class ()
    extends StObject
       with SwitchInput {
    def this(properties: SwitchInputProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SwitchInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `switchInputMod.foo` */
  override def _to: js.Object & SwitchInputConstructor = ^
}
