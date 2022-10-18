package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateIngestEndpointCredentialsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.clientsMediapackageMod.EgressAccessLogs] = js.undefined
  
  var HlsIngest: js.UndefOr[typings.awsSdk.clientsMediapackageMod.HlsIngest] = js.undefined
  
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  var IngressAccessLogs: js.UndefOr[typings.awsSdk.clientsMediapackageMod.IngressAccessLogs] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsMediapackageMod.Tags] = js.undefined
}
object RotateIngestEndpointCredentialsResponse {
  
  inline def apply(): RotateIngestEndpointCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateIngestEndpointCredentialsResponse]
  }
  
  extension [Self <: RotateIngestEndpointCredentialsResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    inline def setHlsIngest(value: HlsIngest): Self = StObject.set(x, "HlsIngest", value.asInstanceOf[js.Any])
    
    inline def setHlsIngestUndefined: Self = StObject.set(x, "HlsIngest", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIngressAccessLogs(value: IngressAccessLogs): Self = StObject.set(x, "IngressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setIngressAccessLogsUndefined: Self = StObject.set(x, "IngressAccessLogs", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
