package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionKeyDescription extends StObject {
  
  /**
    * A map that contains the value for each additional metric.
    */
  var AdditionalMetrics: js.UndefOr[AdditionalMetricsMap] = js.undefined
  
  /**
    * A map of name-value pairs for the dimensions in the group.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.undefined
  
  /**
    * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
    */
  var Partitions: js.UndefOr[MetricValuesList] = js.undefined
  
  /**
    * The aggregated metric value for the dimensions, over the requested time range.
    */
  var Total: js.UndefOr[Double] = js.undefined
}
object DimensionKeyDescription {
  
  inline def apply(): DimensionKeyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionKeyDescription]
  }
  
  extension [Self <: DimensionKeyDescription](x: Self) {
    
    inline def setAdditionalMetrics(value: AdditionalMetricsMap): Self = StObject.set(x, "AdditionalMetrics", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetricsUndefined: Self = StObject.set(x, "AdditionalMetrics", js.undefined)
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setPartitions(value: MetricValuesList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: Double*): Self = StObject.set(x, "Partitions", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
