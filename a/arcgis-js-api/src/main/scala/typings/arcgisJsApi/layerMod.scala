package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.LayerConstructor
import typings.arcgisJsApi.esri.LayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod extends Shortcut {
  
  @JSImport("esri/layers/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/Layer", JSImport.Namespace)
  @js.native
  /**
    * The layer is the most fundamental component of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
    */
  class Class ()
    extends StObject
       with Layer {
    def this(properties: LayerProperties) = this()
  }
  
  type _To = js.Object & LayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `layerMod.foo` */
  override def _to: js.Object & LayerConstructor = ^
}
