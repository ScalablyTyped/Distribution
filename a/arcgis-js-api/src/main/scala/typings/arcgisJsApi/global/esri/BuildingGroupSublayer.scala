package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BuildingGroupSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.BuildingGroupSublayer")
@js.native
/**
		 * Hierarchical group of [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) sublayers.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html)
		 */
open class BuildingGroupSublayer ()
  extends StObject
     with typings.arcgisJsApi.esri.BuildingGroupSublayer {
  def this(properties: BuildingGroupSublayerProperties) = this()
}
/* static members */
object BuildingGroupSublayer {
  
  @JSGlobal("__esri.BuildingGroupSublayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.BuildingGroupSublayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.BuildingGroupSublayer]
}
