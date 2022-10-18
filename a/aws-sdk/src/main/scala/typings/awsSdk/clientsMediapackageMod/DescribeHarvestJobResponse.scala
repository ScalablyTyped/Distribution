package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHarvestJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the HarvestJob.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Channel that the HarvestJob will harvest from.
    */
  var ChannelId: js.UndefOr[string] = js.undefined
  
  /**
    * The time the HarvestJob was submitted
    */
  var CreatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * The end of the time-window which will be harvested.
    */
  var EndTime: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: js.UndefOr[string] = js.undefined
  
  var S3Destination: js.UndefOr[typings.awsSdk.clientsMediapackageMod.S3Destination] = js.undefined
  
  /**
    * The start of the time-window which will be harvested.
    */
  var StartTime: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for
  HarvestJobs as they succeed or fail. In the event of failure, the CloudWatch Event will
  include an explanation of why the HarvestJob failed.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsMediapackageMod.Status] = js.undefined
}
object DescribeHarvestJobResponse {
  
  inline def apply(): DescribeHarvestJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHarvestJobResponse]
  }
  
  extension [Self <: DescribeHarvestJobResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    inline def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEndTime(value: string): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOriginEndpointId(value: string): Self = StObject.set(x, "OriginEndpointId", value.asInstanceOf[js.Any])
    
    inline def setOriginEndpointIdUndefined: Self = StObject.set(x, "OriginEndpointId", js.undefined)
    
    inline def setS3Destination(value: S3Destination): Self = StObject.set(x, "S3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "S3Destination", js.undefined)
    
    inline def setStartTime(value: string): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
