package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BuildingComponentSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.BuildingComponentSublayer")
@js.native
/**
  * BuildingComponentSublayers contain 3D Object features representing building components like doors, pipes or AC units.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html)
  */
open class BuildingComponentSublayer ()
  extends StObject
     with typings.arcgisJsApi.esri.BuildingComponentSublayer {
  def this(properties: BuildingComponentSublayerProperties) = this()
}
/* static members */
object BuildingComponentSublayer {
  
  @JSGlobal("__esri.BuildingComponentSublayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.BuildingComponentSublayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.BuildingComponentSublayer]
}
