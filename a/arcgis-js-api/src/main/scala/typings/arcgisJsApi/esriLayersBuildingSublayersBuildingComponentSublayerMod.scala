package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BuildingComponentSublayer
import typings.arcgisJsApi.esri.BuildingComponentSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersBuildingSublayersBuildingComponentSublayerMod {
  
  @JSImport("esri/layers/buildingSublayers/BuildingComponentSublayer", JSImport.Namespace)
  @js.native
  /**
    * BuildingComponentSublayers contain 3D Object features representing building components like doors, pipes or AC units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html)
    */
  open class ^ ()
    extends StObject
       with BuildingComponentSublayer {
    def this(properties: BuildingComponentSublayerProperties) = this()
  }
  @JSImport("esri/layers/buildingSublayers/BuildingComponentSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): BuildingComponentSublayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[BuildingComponentSublayer]
}
