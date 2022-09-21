package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Slice
import typings.arcgisJsApi.esri.SliceConstructor
import typings.arcgisJsApi.esri.SliceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod extends Shortcut {
  
  @JSImport("esri/widgets/Slice", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slice", JSImport.Namespace)
  @js.native
  /**
    * The Slice widget is a 3D analysis tool that can be used to reveal occluded content in a {@link module:esri/views/SceneView}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html)
    */
  open class Class ()
    extends StObject
       with Slice {
    def this(properties: SliceProperties) = this()
  }
  
  type _To = js.Object & SliceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sliceMod.foo` */
  override def _to: js.Object & SliceConstructor = ^
}
