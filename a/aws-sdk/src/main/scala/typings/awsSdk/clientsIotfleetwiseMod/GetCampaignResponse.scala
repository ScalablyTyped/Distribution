package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the campaign. 
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    *  Information about the data collection scheme associated with the campaign. 
    */
  var collectionScheme: js.UndefOr[CollectionScheme] = js.undefined
  
  /**
    *  Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If OFF is specified, the signals aren't compressed. If it's not specified, SNAPPY is used. 
    */
  var compression: js.UndefOr[Compression] = js.undefined
  
  /**
    *  The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A list of vehicle attributes associated with the campaign. 
    */
  var dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList] = js.undefined
  
  /**
    * The description of the campaign.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. 
    */
  var diagnosticsMode: js.UndefOr[DiagnosticsMode] = js.undefined
  
  /**
    *  The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data won't be collected after the campaign expires.
    */
  var expiryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the campaign was modified.
    */
  var lastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[campaignName] = js.undefined
  
  /**
    *  How long (in seconds) to collect raw data after a triggering event initiates the collection. 
    */
  var postTriggerCollectionDuration: js.UndefOr[uint32] = js.undefined
  
  /**
    *  A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A campaign with the lowest value is deployed to vehicles before any other campaigns.
    */
  var priority: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.priority] = js.undefined
  
  /**
    *  The ARN of a signal catalog. 
    */
  var signalCatalogArn: js.UndefOr[arn] = js.undefined
  
  /**
    *  Information about a list of signals to collect data on. 
    */
  var signalsToCollect: js.UndefOr[SignalInformationList] = js.undefined
  
  /**
    *  Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. 
    */
  var spoolingMode: js.UndefOr[SpoolingMode] = js.undefined
  
  /**
    *  The time, in milliseconds, to deliver a campaign after it was approved.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the campaign. The status can be one of: CREATING, WAITING_FOR_APPROVAL, RUNNING, and SUSPENDED. 
    */
  var status: js.UndefOr[CampaignStatus] = js.undefined
  
  /**
    *  The ARN of the vehicle or the fleet targeted by the campaign. 
    */
  var targetArn: js.UndefOr[arn] = js.undefined
}
object GetCampaignResponse {
  
  inline def apply(): GetCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCampaignResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCampaignResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCollectionScheme(value: CollectionScheme): Self = StObject.set(x, "collectionScheme", value.asInstanceOf[js.Any])
    
    inline def setCollectionSchemeUndefined: Self = StObject.set(x, "collectionScheme", js.undefined)
    
    inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDataExtraDimensions(value: DataExtraDimensionNodePathList): Self = StObject.set(x, "dataExtraDimensions", value.asInstanceOf[js.Any])
    
    inline def setDataExtraDimensionsUndefined: Self = StObject.set(x, "dataExtraDimensions", js.undefined)
    
    inline def setDataExtraDimensionsVarargs(value: NodePath*): Self = StObject.set(x, "dataExtraDimensions", js.Array(value*))
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiagnosticsMode(value: DiagnosticsMode): Self = StObject.set(x, "diagnosticsMode", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsModeUndefined: Self = StObject.set(x, "diagnosticsMode", js.undefined)
    
    inline def setExpiryTime(value: js.Date): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostTriggerCollectionDuration(value: uint32): Self = StObject.set(x, "postTriggerCollectionDuration", value.asInstanceOf[js.Any])
    
    inline def setPostTriggerCollectionDurationUndefined: Self = StObject.set(x, "postTriggerCollectionDuration", js.undefined)
    
    inline def setPriority(value: priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArnUndefined: Self = StObject.set(x, "signalCatalogArn", js.undefined)
    
    inline def setSignalsToCollect(value: SignalInformationList): Self = StObject.set(x, "signalsToCollect", value.asInstanceOf[js.Any])
    
    inline def setSignalsToCollectUndefined: Self = StObject.set(x, "signalsToCollect", js.undefined)
    
    inline def setSignalsToCollectVarargs(value: SignalInformation*): Self = StObject.set(x, "signalsToCollect", js.Array(value*))
    
    inline def setSpoolingMode(value: SpoolingMode): Self = StObject.set(x, "spoolingMode", value.asInstanceOf[js.Any])
    
    inline def setSpoolingModeUndefined: Self = StObject.set(x, "spoolingMode", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: CampaignStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetArn(value: arn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
