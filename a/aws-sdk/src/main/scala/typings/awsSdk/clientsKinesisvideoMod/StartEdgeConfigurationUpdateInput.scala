package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEdgeConfigurationUpdateInput extends StObject {
  
  /**
    * The edge configuration details required to invoke the update process.
    */
  var EdgeConfig: typings.awsSdk.clientsKinesisvideoMod.EdgeConfig
  
  /**
    *  The Amazon Resource Name (ARN) of the stream. Specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream whose edge configuration you want to update. Specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object StartEdgeConfigurationUpdateInput {
  
  inline def apply(EdgeConfig: EdgeConfig): StartEdgeConfigurationUpdateInput = {
    val __obj = js.Dynamic.literal(EdgeConfig = EdgeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEdgeConfigurationUpdateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartEdgeConfigurationUpdateInput] (val x: Self) extends AnyVal {
    
    inline def setEdgeConfig(value: EdgeConfig): Self = StObject.set(x, "EdgeConfig", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
