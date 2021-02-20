package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.InputFieldGroup
import typings.arcgisJsApi.esri.InputFieldGroupConstructor
import typings.arcgisJsApi.esri.InputFieldGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputFieldGroupMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/InputFieldGroup", JSImport.Namespace)
  @js.native
  val ^ : InputFieldGroupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/InputFieldGroup", JSImport.Namespace)
  @js.native
  class Class () extends InputFieldGroup {
    def this(properties: InputFieldGroupProperties) = this()
  }
  
  type _To = InputFieldGroupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `inputFieldGroupMod.foo` */
  override def _to: InputFieldGroupConstructor = ^
}
