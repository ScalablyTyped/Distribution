package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRendererResult extends StObject {
  
  /**
    * The aggregate fields used by the `renderer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#ClusterRendererResult)
    */
  var fields: js.Array[AggregateField]
  
  /**
    * The generated pie chart renderer to use for clustering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#ClusterRendererResult)
    */
  var renderer: PieChartRenderer
}
object ClusterRendererResult {
  
  inline def apply(fields: js.Array[AggregateField], renderer: PieChartRenderer): ClusterRendererResult = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRendererResult] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[AggregateField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: AggregateField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setRenderer(value: PieChartRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
