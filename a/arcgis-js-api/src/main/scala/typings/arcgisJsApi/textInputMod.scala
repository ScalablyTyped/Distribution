package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextInput
import typings.arcgisJsApi.esri.TextInputConstructor
import typings.arcgisJsApi.esri.TextInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  val ^ : TextInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  class Class () extends TextInput {
    def this(properties: TextInputProperties) = this()
  }
  
  type _To = TextInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textInputMod.foo` */
  override def _to: TextInputConstructor = ^
}
