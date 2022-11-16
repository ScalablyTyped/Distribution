package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ControlPointsGeoreferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ControlPointsGeoreference")
@js.native
/**
  * ControlPointsGeoreference is used to set the [geographic location](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#georeference) of the [ImageElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html) or [VideoElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html) referenced in the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html) using the [controlPoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#controlPoints), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#width), and [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#height) parameters.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html)
  */
open class ControlPointsGeoreference ()
  extends StObject
     with typings.arcgisJsApi.esri.ControlPointsGeoreference {
  def this(properties: ControlPointsGeoreferenceProperties) = this()
}
