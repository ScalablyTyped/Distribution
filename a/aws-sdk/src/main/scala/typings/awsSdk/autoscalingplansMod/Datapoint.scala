package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datapoint extends StObject {
  
  /**
    * The time stamp for the data point in UTC format.
    */
  var Timestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The value of the data point.
    */
  var Value: js.UndefOr[MetricScale] = js.native
}
object Datapoint {
  
  @scala.inline
  def apply(): Datapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datapoint]
  }
  
  @scala.inline
  implicit class DatapointMutableBuilder[Self <: Datapoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: TimestampType): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: MetricScale): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
