package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricResultV2 extends StObject {
  
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[MetricDataCollectionsV2] = js.undefined
  
  /**
    * The dimension for the metrics.
    */
  var Dimensions: js.UndefOr[DimensionsV2Map] = js.undefined
}
object MetricResultV2 {
  
  inline def apply(): MetricResultV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricResultV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricResultV2] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: MetricDataCollectionsV2): Self = StObject.set(x, "Collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "Collections", js.undefined)
    
    inline def setCollectionsVarargs(value: MetricDataV2*): Self = StObject.set(x, "Collections", js.Array(value*))
    
    inline def setDimensions(value: DimensionsV2Map): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
  }
}
