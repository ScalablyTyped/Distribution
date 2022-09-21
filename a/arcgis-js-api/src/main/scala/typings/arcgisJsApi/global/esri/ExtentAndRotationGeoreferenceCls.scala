package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ExtentAndRotationGeoreferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ExtentAndRotationGeoreference")
@js.native
/**
  * ExtentAndRotationGeoreference is used to set the [geographic location](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#georeference) of the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html) or [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html) referenced in the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html) using the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#extent) and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#rotation) parameters.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html)
  */
open class ExtentAndRotationGeoreferenceCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ExtentAndRotationGeoreference {
  def this(properties: ExtentAndRotationGeoreferenceProperties) = this()
}
