package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
}
object CreateStreamOutput {
  
  inline def apply(): CreateStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
