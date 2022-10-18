package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.InputField
import typings.arcgisJsApi.esri.InputFieldConstructor
import typings.arcgisJsApi.esri.InputFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormInputFieldMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/InputField", JSImport.Namespace)
  @js.native
  val ^ : js.Object & InputFieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/InputField", JSImport.Namespace)
  @js.native
  /**
    * This is a read-only support class that represents an input field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html)
    */
  open class Class ()
    extends StObject
       with InputField {
    def this(properties: InputFieldProperties) = this()
  }
  
  type _To = js.Object & InputFieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureFormInputFieldMod.foo` */
  override def _to: js.Object & InputFieldConstructor = ^
}
