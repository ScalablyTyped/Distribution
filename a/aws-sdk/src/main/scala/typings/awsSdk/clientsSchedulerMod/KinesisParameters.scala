package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisParameters extends StObject {
  
  /**
    * Specifies the shard to which EventBridge Scheduler sends the event. For more information, see Amazon Kinesis Data Streams terminology and concepts in the Amazon Kinesis Streams Developer Guide.
    */
  var PartitionKey: TargetPartitionKey
}
object KinesisParameters {
  
  inline def apply(PartitionKey: TargetPartitionKey): KinesisParameters = {
    val __obj = js.Dynamic.literal(PartitionKey = PartitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisParameters] (val x: Self) extends AnyVal {
    
    inline def setPartitionKey(value: TargetPartitionKey): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
  }
}
