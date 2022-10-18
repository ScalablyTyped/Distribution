package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataEndpointInput extends StObject {
  
  /**
    * The name of the API action for which to get an endpoint.
    */
  var APIName: typings.awsSdk.clientsKinesisvideoMod.APIName
  
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamName in the request. 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamARN in the request.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object GetDataEndpointInput {
  
  inline def apply(APIName: APIName): GetDataEndpointInput = {
    val __obj = js.Dynamic.literal(APIName = APIName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataEndpointInput]
  }
  
  extension [Self <: GetDataEndpointInput](x: Self) {
    
    inline def setAPIName(value: APIName): Self = StObject.set(x, "APIName", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
