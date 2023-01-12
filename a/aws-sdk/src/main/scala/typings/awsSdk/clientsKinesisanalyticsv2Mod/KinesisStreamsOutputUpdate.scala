package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsOutputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream where you want to write the output.
    */
  var ResourceARNUpdate: ResourceARN
}
object KinesisStreamsOutputUpdate {
  
  inline def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutputUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisStreamsOutputUpdate] (val x: Self) extends AnyVal {
    
    inline def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
