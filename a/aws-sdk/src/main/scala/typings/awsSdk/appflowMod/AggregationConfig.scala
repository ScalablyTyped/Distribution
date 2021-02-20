package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationConfig extends StObject {
  
  /**
    *  Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. 
    */
  var aggregationType: js.UndefOr[AggregationType] = js.native
}
object AggregationConfig {
  
  @scala.inline
  def apply(): AggregationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationConfig]
  }
  
  @scala.inline
  implicit class AggregationConfigMutableBuilder[Self <: AggregationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
  }
}
