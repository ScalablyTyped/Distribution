package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ElevationProfileLineQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ElevationProfileLineQuery")
@js.native
/**
  * Profile line which samples elevation from a custom elevation source, for example by creating a new [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html), or by using an elevation layer from [ground.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html)
  */
open class ElevationProfileLineQueryCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ElevationProfileLineQuery {
  def this(properties: ElevationProfileLineQueryProperties) = this()
}
