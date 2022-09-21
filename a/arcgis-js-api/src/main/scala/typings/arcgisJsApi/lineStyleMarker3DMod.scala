package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineStyleMarker3D
import typings.arcgisJsApi.esri.LineStyleMarker3DConstructor
import typings.arcgisJsApi.esri.LineStyleMarker3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineStyleMarker3DMod extends Shortcut {
  
  @JSImport("esri/symbols/LineStyleMarker3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineStyleMarker3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LineStyleMarker3D", JSImport.Namespace)
  @js.native
  /**
    * LineStyleMarker3D is used for rendering a simple marker graphic on a [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html)
    */
  open class Class ()
    extends StObject
       with LineStyleMarker3D {
    def this(properties: LineStyleMarker3DProperties) = this()
  }
  
  type _To = js.Object & LineStyleMarker3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineStyleMarker3DMod.foo` */
  override def _to: js.Object & LineStyleMarker3DConstructor = ^
}
