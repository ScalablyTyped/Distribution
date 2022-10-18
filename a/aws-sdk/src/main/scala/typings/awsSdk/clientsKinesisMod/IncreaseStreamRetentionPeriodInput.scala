package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncreaseStreamRetentionPeriodInput extends StObject {
  
  /**
    * The new retention period of the stream, in hours. Must be more than the current retention period.
    */
  var RetentionPeriodHours: typings.awsSdk.clientsKinesisMod.RetentionPeriodHours
  
  /**
    * The name of the stream to modify.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
}
object IncreaseStreamRetentionPeriodInput {
  
  inline def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): IncreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodInput]
  }
  
  extension [Self <: IncreaseStreamRetentionPeriodInput](x: Self) {
    
    inline def setRetentionPeriodHours(value: RetentionPeriodHours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
