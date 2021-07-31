package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextInput
import typings.arcgisJsApi.esri.TextInputConstructor
import typings.arcgisJsApi.esri.TextInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TextInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with TextInput {
    def this(properties: TextInputProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & TextInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textInputMod.foo` */
  override def _to: js.Object & TextInputConstructor = ^
}
