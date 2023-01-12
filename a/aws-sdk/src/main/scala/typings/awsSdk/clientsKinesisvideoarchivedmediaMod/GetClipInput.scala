package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClipInput extends StObject {
  
  /**
    * The time range of the requested clip and the source of the timestamps.
    */
  var ClipFragmentSelector: typings.awsSdk.clientsKinesisvideoarchivedmediaMod.ClipFragmentSelector
  
  /**
    * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.  You must specify either the StreamName or the StreamARN. 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream for which to retrieve the media clip.  You must specify either the StreamName or the StreamARN. 
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.StreamName] = js.undefined
}
object GetClipInput {
  
  inline def apply(ClipFragmentSelector: ClipFragmentSelector): GetClipInput = {
    val __obj = js.Dynamic.literal(ClipFragmentSelector = ClipFragmentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClipInput] (val x: Self) extends AnyVal {
    
    inline def setClipFragmentSelector(value: ClipFragmentSelector): Self = StObject.set(x, "ClipFragmentSelector", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
