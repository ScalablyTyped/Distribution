package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.EditorViewModel
import typings.arcgisJsApi.esri.EditorViewModelConstructor
import typings.arcgisJsApi.esri.EditorViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/EditorViewModel", JSImport.Namespace)
  @js.native
  val ^ : EditorViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/EditorViewModel", JSImport.Namespace)
  @js.native
  class Class () extends EditorViewModel {
    def this(properties: EditorViewModelProperties) = this()
  }
  
  type _To = EditorViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `editorViewModelMod.foo` */
  override def _to: EditorViewModelConstructor = ^
}
