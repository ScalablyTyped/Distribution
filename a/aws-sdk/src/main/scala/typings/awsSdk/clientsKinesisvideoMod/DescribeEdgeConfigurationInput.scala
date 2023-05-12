package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEdgeConfigurationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stream. Specify either the StreamNameor the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream whose edge configuration you want to update. Specify either the StreamName or the StreamARN. 
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object DescribeEdgeConfigurationInput {
  
  inline def apply(): DescribeEdgeConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEdgeConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEdgeConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
