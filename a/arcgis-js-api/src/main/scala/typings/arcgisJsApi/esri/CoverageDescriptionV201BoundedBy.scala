package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201BoundedBy extends StObject {
  
  /**
    * The coverage's axis name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var axisLabels: js.Array[String]
  
  /**
    * Start date for the temporal extent of a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var beginPosition: js.UndefOr[js.Date] = js.undefined
  
  /**
    * End date for the temporal extent of the coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var endPosition: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The spatial extent dimensions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var envelopeAllDims: CoverageDescriptionV201BoundedByEnvelopeAllDims
  
  /**
    * The spatial extent of a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var extent: Extent
  
  /**
    * Is east first.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var isEastFirst: Boolean
  
  /**
    * List of unit of measure (uom) labels for all the axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var uomLabels: js.Array[String]
}
object CoverageDescriptionV201BoundedBy {
  
  inline def apply(
    axisLabels: js.Array[String],
    envelopeAllDims: CoverageDescriptionV201BoundedByEnvelopeAllDims,
    extent: Extent,
    isEastFirst: Boolean,
    uomLabels: js.Array[String]
  ): CoverageDescriptionV201BoundedBy = {
    val __obj = js.Dynamic.literal(axisLabels = axisLabels.asInstanceOf[js.Any], envelopeAllDims = envelopeAllDims.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], isEastFirst = isEastFirst.asInstanceOf[js.Any], uomLabels = uomLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV201BoundedBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201BoundedBy] (val x: Self) extends AnyVal {
    
    inline def setAxisLabels(value: js.Array[String]): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelsVarargs(value: String*): Self = StObject.set(x, "axisLabels", js.Array(value*))
    
    inline def setBeginPosition(value: js.Date): Self = StObject.set(x, "beginPosition", value.asInstanceOf[js.Any])
    
    inline def setBeginPositionUndefined: Self = StObject.set(x, "beginPosition", js.undefined)
    
    inline def setEndPosition(value: js.Date): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setEnvelopeAllDims(value: CoverageDescriptionV201BoundedByEnvelopeAllDims): Self = StObject.set(x, "envelopeAllDims", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setIsEastFirst(value: Boolean): Self = StObject.set(x, "isEastFirst", value.asInstanceOf[js.Any])
    
    inline def setUomLabels(value: js.Array[String]): Self = StObject.set(x, "uomLabels", value.asInstanceOf[js.Any])
    
    inline def setUomLabelsVarargs(value: String*): Self = StObject.set(x, "uomLabels", js.Array(value*))
  }
}
