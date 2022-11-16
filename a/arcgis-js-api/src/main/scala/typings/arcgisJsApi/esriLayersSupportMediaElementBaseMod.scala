package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ControlPointsGeoreference
import typings.arcgisJsApi.esri.CornersGeoreference
import typings.arcgisJsApi.esri.ExtentAndRotationGeoreference
import typings.arcgisJsApi.esri.MediaElementBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportMediaElementBaseMod {
  
  @JSImport("esri/layers/support/MediaElementBase", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MediaElementBase {
    
    /**
      * The geographic location of the image or video element to be placed on the map.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
      */
    /* CompleteClass */
    var georeference: ExtentAndRotationGeoreference | CornersGeoreference | ControlPointsGeoreference = js.native
    
    /**
      * The opacity of the element.
      *
      * @default 1
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
      */
    /* CompleteClass */
    var opacity: Double = js.native
  }
}
