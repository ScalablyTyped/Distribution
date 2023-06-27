package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BuildingSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.BuildingSublayer")
@js.native
/**
		 * BuildingSublayer is the base class for sublayers of a BuildingSceneLayer.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html)
		 */
open class BuildingSublayer ()
  extends StObject
     with typings.arcgisJsApi.esri.BuildingSublayer {
  def this(properties: BuildingSublayerProperties) = this()
}
/* static members */
object BuildingSublayer {
  
  @JSGlobal("__esri.BuildingSublayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.BuildingSublayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.BuildingSublayer]
}
