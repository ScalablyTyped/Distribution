package typings.awsSdk.anon

import typings.awsSdk.clientsNimbleMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/nimble.GetStreamingImageRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetStreamingImageRequestw extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The streaming image ID.
    */
  var streamingImageId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStreamingImageRequestw {
  
  inline def apply(streamingImageId: String, studioId: String): GetStreamingImageRequestw = {
    val __obj = js.Dynamic.literal(streamingImageId = streamingImageId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingImageRequestw]
  }
  
  extension [Self <: GetStreamingImageRequestw](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setStreamingImageId(value: String): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
