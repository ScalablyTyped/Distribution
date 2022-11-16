package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ElevationProfileLineQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ElevationProfileLineQuery")
@js.native
/**
  * Profile line which samples elevation from a custom elevation source, for example by creating a new [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html), or by using an elevation layer from [ground.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html)
  */
open class ElevationProfileLineQuery ()
  extends StObject
     with typings.arcgisJsApi.esri.ElevationProfileLineQuery {
  def this(properties: ElevationProfileLineQueryProperties) = this()
}
