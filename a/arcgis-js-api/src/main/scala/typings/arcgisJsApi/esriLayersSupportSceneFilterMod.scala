package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SceneFilter
import typings.arcgisJsApi.esri.SceneFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportSceneFilterMod {
  
  @JSImport("esri/layers/support/SceneFilter", JSImport.Namespace)
  @js.native
  /**
    * A SceneFilter defines parameters for setting a client-side spatial filter on a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#filter).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html)
    */
  open class ^ ()
    extends StObject
       with SceneFilter {
    def this(properties: SceneFilterProperties) = this()
  }
}
