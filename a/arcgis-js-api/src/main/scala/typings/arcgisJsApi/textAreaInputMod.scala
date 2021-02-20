package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextAreaInput
import typings.arcgisJsApi.esri.TextAreaInputConstructor
import typings.arcgisJsApi.esri.TextAreaInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/TextAreaInput", JSImport.Namespace)
  @js.native
  val ^ : TextAreaInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/TextAreaInput", JSImport.Namespace)
  @js.native
  class Class () extends TextAreaInput {
    def this(properties: TextAreaInputProperties) = this()
  }
  
  type _To = TextAreaInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textAreaInputMod.foo` */
  override def _to: TextAreaInputConstructor = ^
}
