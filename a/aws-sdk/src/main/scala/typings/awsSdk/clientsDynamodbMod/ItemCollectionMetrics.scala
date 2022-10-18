package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCollectionMetrics extends StObject {
  
  /**
    * The partition key value of the item collection. This value is the same as the partition key value of the item.
    */
  var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined
  
  /**
    * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
    */
  var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined
}
object ItemCollectionMetrics {
  
  inline def apply(): ItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCollectionMetrics]
  }
  
  extension [Self <: ItemCollectionMetrics](x: Self) {
    
    inline def setItemCollectionKey(value: ItemCollectionKeyAttributeMap): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
    
    inline def setSizeEstimateRangeGB(value: ItemCollectionSizeEstimateRange): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
    
    inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
    
    inline def setSizeEstimateRangeGBVarargs(value: ItemCollectionSizeEstimateBound*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value*))
  }
}
