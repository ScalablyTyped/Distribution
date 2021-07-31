package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BaseElevationLayer
import typings.arcgisJsApi.esri.BaseElevationLayerConstructor
import typings.arcgisJsApi.esri.BaseElevationLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseElevationLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BaseElevationLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * BaseElevationLayer is intended to be extended for creating custom elevation layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html)
    */
  class Class ()
    extends StObject
       with BaseElevationLayer {
    def this(properties: BaseElevationLayerProperties) = this()
  }
  
  type _To = js.Object & BaseElevationLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `baseElevationLayerMod.foo` */
  override def _to: js.Object & BaseElevationLayerConstructor = ^
}
