package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.StylePattern3D
import typings.arcgisJsApi.esri.StylePattern3DConstructor
import typings.arcgisJsApi.esri.StylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylePattern3DMod extends Shortcut {
  
  @JSImport("esri/symbols/patterns/StylePattern3D", JSImport.Namespace)
  @js.native
  val ^ : StylePattern3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/patterns/StylePattern3D", JSImport.Namespace)
  @js.native
  /**
    * Renders polygons with predefined style pattern fills.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html)
    */
  class Class () extends StylePattern3D {
    def this(properties: StylePattern3DProperties) = this()
  }
  
  type _To = StylePattern3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `stylePattern3DMod.foo` */
  override def _to: StylePattern3DConstructor = ^
}
