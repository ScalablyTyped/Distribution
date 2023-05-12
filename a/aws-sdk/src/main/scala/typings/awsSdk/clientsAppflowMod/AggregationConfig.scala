package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationConfig extends StObject {
  
  /**
    *  Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. 
    */
  var aggregationType: js.UndefOr[AggregationType] = js.undefined
  
  /**
    * The desired file size, in MB, for each output file that Amazon AppFlow writes to the flow destination. For each file, Amazon AppFlow attempts to achieve the size that you specify. The actual file sizes might differ from this target based on the number and size of the records that each file contains.
    */
  var targetFileSize: js.UndefOr[Long] = js.undefined
}
object AggregationConfig {
  
  inline def apply(): AggregationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationConfig] (val x: Self) extends AnyVal {
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
    
    inline def setTargetFileSize(value: Long): Self = StObject.set(x, "targetFileSize", value.asInstanceOf[js.Any])
    
    inline def setTargetFileSizeUndefined: Self = StObject.set(x, "targetFileSize", js.undefined)
  }
}
