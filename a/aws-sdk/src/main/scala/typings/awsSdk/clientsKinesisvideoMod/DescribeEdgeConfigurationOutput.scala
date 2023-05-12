package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEdgeConfigurationOutput extends StObject {
  
  /**
    * The timestamp at which a stream’s edge configuration was first created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT Greengrass component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
    */
  var EdgeConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.EdgeConfig] = js.undefined
  
  /**
    * A description of the generated failure status.
    */
  var FailedStatusDetails: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.FailedStatusDetails] = js.undefined
  
  /**
    * The timestamp at which a stream’s edge configuration was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream from which the edge configuration was updated.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
  
  /**
    * The latest status of the edge configuration update.
    */
  var SyncStatus: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.SyncStatus] = js.undefined
}
object DescribeEdgeConfigurationOutput {
  
  inline def apply(): DescribeEdgeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEdgeConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEdgeConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEdgeConfig(value: EdgeConfig): Self = StObject.set(x, "EdgeConfig", value.asInstanceOf[js.Any])
    
    inline def setEdgeConfigUndefined: Self = StObject.set(x, "EdgeConfig", js.undefined)
    
    inline def setFailedStatusDetails(value: FailedStatusDetails): Self = StObject.set(x, "FailedStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setFailedStatusDetailsUndefined: Self = StObject.set(x, "FailedStatusDetails", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    inline def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "SyncStatus", value.asInstanceOf[js.Any])
    
    inline def setSyncStatusUndefined: Self = StObject.set(x, "SyncStatus", js.undefined)
  }
}
