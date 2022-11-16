package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BuildingSublayer
import typings.arcgisJsApi.esri.BuildingSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersBuildingSublayersBuildingSublayerMod {
  
  @JSImport("esri/layers/buildingSublayers/BuildingSublayer", JSImport.Namespace)
  @js.native
  /**
    * BuildingSublayer is the base class for sublayers of a BuildingSceneLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html)
    */
  open class ^ ()
    extends StObject
       with BuildingSublayer {
    def this(properties: BuildingSublayerProperties) = this()
  }
  @JSImport("esri/layers/buildingSublayers/BuildingSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): BuildingSublayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[BuildingSublayer]
}
