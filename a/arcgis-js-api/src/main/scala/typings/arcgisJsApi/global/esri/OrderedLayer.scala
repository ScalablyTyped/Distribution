package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.OrderedLayerOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.OrderedLayer")
@js.native
open class OrderedLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.OrderedLayer {
  
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
