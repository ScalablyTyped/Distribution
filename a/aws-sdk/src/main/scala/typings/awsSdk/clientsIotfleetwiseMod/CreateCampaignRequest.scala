package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignRequest extends StObject {
  
  /**
    *  The data collection scheme associated with the campaign. You can specify a scheme that collects data based on time or an event.
    */
  var collectionScheme: CollectionScheme
  
  /**
    *  (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If you don't want to compress the signals, use OFF. If it's not specified, SNAPPY is used.  Default: SNAPPY 
    */
  var compression: js.UndefOr[Compression] = js.undefined
  
  /**
    *  (Optional) A list of vehicle attributes to associate with a campaign.  Enrich the data with specified vehicle attributes. For example, add make and model to the campaign, and Amazon Web Services IoT FleetWise will associate the data with those attributes as dimensions in Amazon Timestream. You can then query the data against make and model. Default: An empty array
    */
  var dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList] = js.undefined
  
  /**
    * An optional description of the campaign to help identify its purpose.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If you want to send diagnostic trouble codes, use SEND_ACTIVE_DTCS. If it's not specified, OFF is used. Default: OFF 
    */
  var diagnosticsMode: js.UndefOr[DiagnosticsMode] = js.undefined
  
  /**
    *  (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data won't be collected after the campaign expires.  Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
    */
  var expiryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The name of the campaign to create. 
    */
  var name: campaignName
  
  /**
    *  (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the collection. If it's not specified, 0 is used. Default: 0 
    */
  var postTriggerCollectionDuration: js.UndefOr[uint32] = js.undefined
  
  /**
    * (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not specified, 0 is used.  Default: 0 
    */
  var priority: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.priority] = js.undefined
  
  /**
    * (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign. 
    */
  var signalCatalogArn: arn
  
  /**
    * (Optional) A list of information about signals to collect. 
    */
  var signalsToCollect: js.UndefOr[SignalInformationList] = js.undefined
  
  /**
    * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If you want to store collected data when a vehicle loses connection with the cloud, use TO_DISK. If it's not specified, OFF is used. Default: OFF 
    */
  var spoolingMode: js.UndefOr[SpoolingMode] = js.undefined
  
  /**
    * (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified, 0 is used. Default: 0 
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Metadata that can be used to manage the campaign.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    *  The ARN of the vehicle or fleet to deploy a campaign to. 
    */
  var targetArn: arn
}
object CreateCampaignRequest {
  
  inline def apply(collectionScheme: CollectionScheme, name: campaignName, signalCatalogArn: arn, targetArn: arn): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(collectionScheme = collectionScheme.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signalCatalogArn = signalCatalogArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCampaignRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionScheme(value: CollectionScheme): Self = StObject.set(x, "collectionScheme", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setDataExtraDimensions(value: DataExtraDimensionNodePathList): Self = StObject.set(x, "dataExtraDimensions", value.asInstanceOf[js.Any])
    
    inline def setDataExtraDimensionsUndefined: Self = StObject.set(x, "dataExtraDimensions", js.undefined)
    
    inline def setDataExtraDimensionsVarargs(value: NodePath*): Self = StObject.set(x, "dataExtraDimensions", js.Array(value*))
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiagnosticsMode(value: DiagnosticsMode): Self = StObject.set(x, "diagnosticsMode", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsModeUndefined: Self = StObject.set(x, "diagnosticsMode", js.undefined)
    
    inline def setExpiryTime(value: js.Date): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPostTriggerCollectionDuration(value: uint32): Self = StObject.set(x, "postTriggerCollectionDuration", value.asInstanceOf[js.Any])
    
    inline def setPostTriggerCollectionDurationUndefined: Self = StObject.set(x, "postTriggerCollectionDuration", js.undefined)
    
    inline def setPriority(value: priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setSignalsToCollect(value: SignalInformationList): Self = StObject.set(x, "signalsToCollect", value.asInstanceOf[js.Any])
    
    inline def setSignalsToCollectUndefined: Self = StObject.set(x, "signalsToCollect", js.undefined)
    
    inline def setSignalsToCollectVarargs(value: SignalInformation*): Self = StObject.set(x, "signalsToCollect", js.Array(value*))
    
    inline def setSpoolingMode(value: SpoolingMode): Self = StObject.set(x, "spoolingMode", value.asInstanceOf[js.Any])
    
    inline def setSpoolingModeUndefined: Self = StObject.set(x, "spoolingMode", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTargetArn(value: arn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
