package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OrderedLayer
import typings.arcgisJsApi.esri.OrderedLayerConstructor
import typings.arcgisJsApi.esri.OrderedLayerOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderedLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/OrderedLayer", JSImport.Namespace)
  @js.native
  val ^ : OrderedLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/OrderedLayer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with OrderedLayer {
    
    /**
      * Determines the order in which features are drawn in the view.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
      */
    /* CompleteClass */
    var orderBy: js.Array[OrderedLayerOrderBy] = js.native
  }
  
  type _To = OrderedLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `orderedLayerMod.foo` */
  override def _to: OrderedLayerConstructor = ^
}
