package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ScaleRangeLayer
import typings.arcgisJsApi.esri.ScaleRangeLayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsScaleRangeLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ScaleRangeLayer", JSImport.Namespace)
  @js.native
  val ^ : ScaleRangeLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ScaleRangeLayer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with ScaleRangeLayer {
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
  }
  
  type _To = ScaleRangeLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsScaleRangeLayerMod.foo` */
  override def _to: ScaleRangeLayerConstructor = ^
}
