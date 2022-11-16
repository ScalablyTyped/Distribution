package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.CornersGeoreferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.CornersGeoreference")
@js.native
/**
  * CornersGeoreference is used to set the [geographic location](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#georeference) of the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html) or [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html) referenced in the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html) using corner points of a bounding box.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html)
  */
open class CornersGeoreference ()
  extends StObject
     with typings.arcgisJsApi.esri.CornersGeoreference {
  def this(properties: CornersGeoreferenceProperties) = this()
}
