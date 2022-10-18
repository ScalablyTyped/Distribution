package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseOutput extends StObject {
  
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var ResourceARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}
object KinesisFirehoseOutput {
  
  inline def apply(ResourceARN: ResourceARN): KinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseOutput]
  }
  
  extension [Self <: KinesisFirehoseOutput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
