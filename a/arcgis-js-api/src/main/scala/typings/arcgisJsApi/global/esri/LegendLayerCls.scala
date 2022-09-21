package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LegendLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LegendLayer")
@js.native
/**
  * Define layer properties for the legend layers associated with a [PrintTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html)
  */
open class LegendLayerCls ()
  extends StObject
     with typings.arcgisJsApi.esri.LegendLayer {
  def this(properties: LegendLayerProperties) = this()
}
