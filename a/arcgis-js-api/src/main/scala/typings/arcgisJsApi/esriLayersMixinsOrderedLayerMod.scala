package typings.arcgisJsApi

import typings.arcgisJsApi.esri.OrderedLayer
import typings.arcgisJsApi.esri.OrderedLayerOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsOrderedLayerMod {
  
  @JSImport("esri/layers/mixins/OrderedLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
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
}
