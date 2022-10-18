package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsInput extends StObject {
  
  /**
    * The ARN of the input Kinesis data stream to read.
    */
  var ResourceARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}
object KinesisStreamsInput {
  
  inline def apply(ResourceARN: ResourceARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInput]
  }
  
  extension [Self <: KinesisStreamsInput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
