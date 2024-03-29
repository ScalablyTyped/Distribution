package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelResponse extends StObject {
  
  /**
    * The ARN of an channel returned by a GetChannel request.
    */
  var ChannelArn: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ChannelArn] = js.undefined
  
  /**
    * The destinations for the channel. For channels created for integrations, the destinations are the event data stores that log events arriving through the channel. For service-linked channels, the destination is the Amazon Web Services service that created the service-linked channel to receive events.
    */
  var Destinations: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Destinations] = js.undefined
  
  /**
    * A table showing information about the most recent successful and failed attempts to ingest events.
    */
  var IngestionStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.IngestionStatus] = js.undefined
  
  /**
    *  The name of the CloudTrail channel. For service-linked channels, the name is aws-service-channel/service-name/custom-suffix where service-name represents the name of the Amazon Web Services service that created the channel and custom-suffix represents the suffix generated by the Amazon Web Services service. 
    */
  var Name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * The source for the CloudTrail channel.
    */
  var Source: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Source] = js.undefined
  
  /**
    *  Provides information about the advanced event selectors configured for the channel, and whether the channel applies to all regions or a single region. 
    */
  var SourceConfig: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.SourceConfig] = js.undefined
}
object GetChannelResponse {
  
  inline def apply(): GetChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setIngestionStatus(value: IngestionStatus): Self = StObject.set(x, "IngestionStatus", value.asInstanceOf[js.Any])
    
    inline def setIngestionStatusUndefined: Self = StObject.set(x, "IngestionStatus", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceConfig(value: SourceConfig): Self = StObject.set(x, "SourceConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigUndefined: Self = StObject.set(x, "SourceConfig", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
