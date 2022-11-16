package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Slice
import typings.arcgisJsApi.esri.SliceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSliceMod {
  
  @JSImport("esri/widgets/Slice", JSImport.Namespace)
  @js.native
  /**
    * The Slice widget is a 3D analysis tool that can be used to reveal occluded content in a {@link module:esri/views/SceneView}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html)
    */
  open class ^ ()
    extends StObject
       with Slice {
    def this(properties: SliceProperties) = this()
  }
}
