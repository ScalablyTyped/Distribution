package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsOutput extends StObject {
  
  /**
    * The ARN of the destination Kinesis data stream to write to.
    */
  var ResourceARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}
object KinesisStreamsOutput {
  
  inline def apply(ResourceARN: ResourceARN): KinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutput]
  }
  
  extension [Self <: KinesisStreamsOutput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
