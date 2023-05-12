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
    * The ARN of the stream.
    */
  var StreamARN: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamARN] = js.undefined
  
  /**
    * The name of the stream to modify.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamName] = js.undefined
}
object IncreaseStreamRetentionPeriodInput {
  
  inline def apply(RetentionPeriodHours: RetentionPeriodHours): IncreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncreaseStreamRetentionPeriodInput] (val x: Self) extends AnyVal {
    
    inline def setRetentionPeriodHours(value: RetentionPeriodHours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
