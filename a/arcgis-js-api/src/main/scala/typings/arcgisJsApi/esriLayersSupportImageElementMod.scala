package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ControlPointsGeoreference
import typings.arcgisJsApi.esri.CornersGeoreference
import typings.arcgisJsApi.esri.ExtentAndRotationGeoreference
import typings.arcgisJsApi.esri.ImageElement
import typings.arcgisJsApi.esri.ImageElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportImageElementMod {
  
  @JSImport("esri/layers/support/ImageElement", JSImport.Namespace)
  @js.native
  /**
    * Represents an image element referenced in the MediaLayer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html)
    */
  open class ^ ()
    extends StObject
       with ImageElement {
    def this(properties: ImageElementProperties) = this()
    
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
