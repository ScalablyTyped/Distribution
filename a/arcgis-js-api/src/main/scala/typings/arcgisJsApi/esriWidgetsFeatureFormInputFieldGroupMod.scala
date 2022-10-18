package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.InputFieldGroup
import typings.arcgisJsApi.esri.InputFieldGroupConstructor
import typings.arcgisJsApi.esri.InputFieldGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormInputFieldGroupMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/InputFieldGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Object & InputFieldGroupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/InputFieldGroup", JSImport.Namespace)
  @js.native
  /**
    * This is a read-only support class that represents a group of input fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html)
    */
  open class Class ()
    extends StObject
       with InputFieldGroup {
    def this(properties: InputFieldGroupProperties) = this()
  }
  
  type _To = js.Object & InputFieldGroupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureFormInputFieldGroupMod.foo` */
  override def _to: js.Object & InputFieldGroupConstructor = ^
}
