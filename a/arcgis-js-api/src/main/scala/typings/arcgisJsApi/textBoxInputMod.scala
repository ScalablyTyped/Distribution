package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextBoxInput
import typings.arcgisJsApi.esri.TextBoxInputConstructor
import typings.arcgisJsApi.esri.TextBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBoxInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/TextBoxInput", JSImport.Namespace)
  @js.native
  val ^ : TextBoxInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/TextBoxInput", JSImport.Namespace)
  @js.native
  class Class () extends TextBoxInput {
    def this(properties: TextBoxInputProperties) = this()
  }
  
  type _To = TextBoxInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textBoxInputMod.foo` */
  override def _to: TextBoxInputConstructor = ^
}
