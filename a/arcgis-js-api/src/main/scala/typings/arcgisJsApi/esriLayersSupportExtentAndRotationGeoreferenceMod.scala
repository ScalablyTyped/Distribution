package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ExtentAndRotationGeoreference
import typings.arcgisJsApi.esri.ExtentAndRotationGeoreferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportExtentAndRotationGeoreferenceMod {
  
  @JSImport("esri/layers/support/ExtentAndRotationGeoreference", JSImport.Namespace)
  @js.native
  /**
    * ExtentAndRotationGeoreference is used to set the [geographic location](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#georeference) of the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html) or [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html) referenced in the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html) using the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#extent) and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#rotation) parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html)
    */
  open class ^ ()
    extends StObject
       with ExtentAndRotationGeoreference {
    def this(properties: ExtentAndRotationGeoreferenceProperties) = this()
  }
}
