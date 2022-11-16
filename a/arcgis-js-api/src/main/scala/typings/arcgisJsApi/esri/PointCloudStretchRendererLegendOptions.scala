package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudStretchRendererLegendOptions extends StObject {
  
  /**
    * Describes the variable driving the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PointCloudStretchRendererLegendOptions {
  
  inline def apply(): PointCloudStretchRendererLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudStretchRendererLegendOptions]
  }
  
  extension [Self <: PointCloudStretchRendererLegendOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
