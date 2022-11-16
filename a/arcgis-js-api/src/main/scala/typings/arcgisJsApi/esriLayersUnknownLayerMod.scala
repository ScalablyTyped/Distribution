package typings.arcgisJsApi

import typings.arcgisJsApi.esri.UnknownLayer
import typings.arcgisJsApi.esri.UnknownLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersUnknownLayerMod {
  
  @JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a layer whose type could not be determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-UnknownLayer.html)
    */
  open class ^ ()
    extends StObject
       with UnknownLayer {
    def this(properties: UnknownLayerProperties) = this()
  }
}
