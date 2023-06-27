package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BuildingGroupSublayer
import typings.arcgisJsApi.esri.BuildingGroupSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersBuildingSublayersBuildingGroupSublayerMod {
  
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  /**
  		 * Hierarchical group of [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) sublayers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html)
  		 */
  open class ^ ()
    extends StObject
       with BuildingGroupSublayer {
    def this(properties: BuildingGroupSublayerProperties) = this()
  }
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): BuildingGroupSublayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[BuildingGroupSublayer]
}
