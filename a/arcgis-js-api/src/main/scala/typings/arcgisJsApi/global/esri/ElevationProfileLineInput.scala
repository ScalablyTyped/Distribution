package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ElevationProfileLineInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ElevationProfileLineInput")
@js.native
/**
  * Profile line which samples elevation from the geometry of the input [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) itself, typically used on input lines with z values.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineInput.html)
  */
open class ElevationProfileLineInput ()
  extends StObject
     with typings.arcgisJsApi.esri.ElevationProfileLineInput {
  def this(properties: ElevationProfileLineInputProperties) = this()
}
