package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseInputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the input delivery stream to read.
    */
  var ResourceARNUpdate: ResourceARN
}
object KinesisFirehoseInputUpdate {
  
  inline def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseInputUpdate]
  }
  
  extension [Self <: KinesisFirehoseInputUpdate](x: Self) {
    
    inline def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
