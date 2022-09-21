package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Edits
import typings.arcgisJsApi.esri.EditsConstructor
import typings.arcgisJsApi.esri.EditsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editsMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/Edits", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EditsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/Edits", JSImport.Namespace)
  @js.native
  /**
    * This class supports the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html)
    */
  open class Class ()
    extends StObject
       with Edits {
    def this(properties: EditsProperties) = this()
  }
  
  type _To = js.Object & EditsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `editsMod.foo` */
  override def _to: js.Object & EditsConstructor = ^
}
