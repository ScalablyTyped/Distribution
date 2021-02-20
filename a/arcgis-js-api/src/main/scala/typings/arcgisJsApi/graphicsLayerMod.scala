package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GraphicsLayer
import typings.arcgisJsApi.esri.GraphicsLayerConstructor
import typings.arcgisJsApi.esri.GraphicsLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsLayerMod extends Shortcut {
  
  @JSImport("esri/layers/GraphicsLayer", JSImport.Namespace)
  @js.native
  val ^ : GraphicsLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/GraphicsLayer", JSImport.Namespace)
  @js.native
  /**
    * A GraphicsLayer contains one or more client-side [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html)
    */
  class Class () extends GraphicsLayer {
    def this(properties: GraphicsLayerProperties) = this()
  }
  
  type _To = GraphicsLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `graphicsLayerMod.foo` */
  override def _to: GraphicsLayerConstructor = ^
}
