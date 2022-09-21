package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Input
import typings.arcgisJsApi.esri.InputConstructor
import typings.arcgisJsApi.esri.InputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("esri/views/input/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Object & InputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/input/Input", JSImport.Namespace)
  @js.native
  /**
    * Input device related configuration settings on the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-Input.html)
    */
  open class Class ()
    extends StObject
       with Input {
    def this(properties: InputProperties) = this()
  }
  
  type _To = js.Object & InputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `inputMod.foo` */
  override def _to: js.Object & InputConstructor = ^
}
