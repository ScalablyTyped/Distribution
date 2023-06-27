package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201DomainSet extends StObject {
  
  /**
  		 * Axis labels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var axisLabels: js.Array[String]
  
  /**
  		 * Domain columns of a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var columns: Double
  
  /**
  		 * Domain grid samples.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var gridSamples: js.Array[Double]
  
  /**
  		 * Has same axis labels as bounded by.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var hasSameAxisLabelsAsBoundedBy: Boolean
  
  /**
  		 * Domain offset.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var offset: js.Array[Double]
  
  /**
  		 * Domain origin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var origin: js.Array[Double]
  
  /**
  		 * Domain x, y resolution.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var resolution: CoverageDescriptionV201DomainSetResolution
  
  /**
  		 * Domain rows of a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var rows: Double
}
object CoverageDescriptionV201DomainSet {
  
  inline def apply(
    axisLabels: js.Array[String],
    columns: Double,
    gridSamples: js.Array[Double],
    hasSameAxisLabelsAsBoundedBy: Boolean,
    offset: js.Array[Double],
    origin: js.Array[Double],
    resolution: CoverageDescriptionV201DomainSetResolution,
    rows: Double
  ): CoverageDescriptionV201DomainSet = {
    val __obj = js.Dynamic.literal(axisLabels = axisLabels.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], gridSamples = gridSamples.asInstanceOf[js.Any], hasSameAxisLabelsAsBoundedBy = hasSameAxisLabelsAsBoundedBy.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV201DomainSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201DomainSet] (val x: Self) extends AnyVal {
    
    inline def setAxisLabels(value: js.Array[String]): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelsVarargs(value: String*): Self = StObject.set(x, "axisLabels", js.Array(value*))
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setGridSamples(value: js.Array[Double]): Self = StObject.set(x, "gridSamples", value.asInstanceOf[js.Any])
    
    inline def setGridSamplesVarargs(value: Double*): Self = StObject.set(x, "gridSamples", js.Array(value*))
    
    inline def setHasSameAxisLabelsAsBoundedBy(value: Boolean): Self = StObject.set(x, "hasSameAxisLabelsAsBoundedBy", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setResolution(value: CoverageDescriptionV201DomainSetResolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
