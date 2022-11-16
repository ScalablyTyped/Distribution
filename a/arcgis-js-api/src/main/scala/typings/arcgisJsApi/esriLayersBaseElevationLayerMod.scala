package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BaseElevationLayer
import typings.arcgisJsApi.esri.BaseElevationLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersBaseElevationLayerMod {
  
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * BaseElevationLayer is intended to be extended for creating custom elevation layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html)
    */
  open class ^ ()
    extends StObject
       with BaseElevationLayer {
    def this(properties: BaseElevationLayerProperties) = this()
  }
}
