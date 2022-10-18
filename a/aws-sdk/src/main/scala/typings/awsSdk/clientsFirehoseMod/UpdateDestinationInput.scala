package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDestinationInput extends StObject {
  
  var AmazonopensearchserviceDestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.AmazonopensearchserviceDestinationUpdate] = js.undefined
  
  /**
    * Obtain this value from the VersionId result of DeliveryStreamDescription. This value is required, and helps the service perform conditional operations. For example, if there is an interleaving update and this value is null, then the update destination fails. After the update is successful, the VersionId value is updated. The service then performs a merge of the old configuration with the new configuration.
    */
  var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.clientsFirehoseMod.DeliveryStreamName
  
  /**
    * The ID of the destination.
    */
  var DestinationId: typings.awsSdk.clientsFirehoseMod.DestinationId
  
  /**
    * Describes an update for a destination in Amazon ES.
    */
  var ElasticsearchDestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ElasticsearchDestinationUpdate] = js.undefined
  
  /**
    * Describes an update for a destination in Amazon S3.
    */
  var ExtendedS3DestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ExtendedS3DestinationUpdate] = js.undefined
  
  /**
    * Describes an update to the specified HTTP endpoint destination.
    */
  var HttpEndpointDestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.HttpEndpointDestinationUpdate] = js.undefined
  
  /**
    * Describes an update for a destination in Amazon Redshift.
    */
  var RedshiftDestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RedshiftDestinationUpdate] = js.undefined
  
  /**
    * [Deprecated] Describes an update for a destination in Amazon S3.
    */
  var S3DestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.S3DestinationUpdate] = js.undefined
  
  /**
    * Describes an update for a destination in Splunk.
    */
  var SplunkDestinationUpdate: js.UndefOr[typings.awsSdk.clientsFirehoseMod.SplunkDestinationUpdate] = js.undefined
}
object UpdateDestinationInput {
  
  inline def apply(
    CurrentDeliveryStreamVersionId: DeliveryStreamVersionId,
    DeliveryStreamName: DeliveryStreamName,
    DestinationId: DestinationId
  ): UpdateDestinationInput = {
    val __obj = js.Dynamic.literal(CurrentDeliveryStreamVersionId = CurrentDeliveryStreamVersionId.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationInput]
  }
  
  extension [Self <: UpdateDestinationInput](x: Self) {
    
    inline def setAmazonopensearchserviceDestinationUpdate(value: AmazonopensearchserviceDestinationUpdate): Self = StObject.set(x, "AmazonopensearchserviceDestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setAmazonopensearchserviceDestinationUpdateUndefined: Self = StObject.set(x, "AmazonopensearchserviceDestinationUpdate", js.undefined)
    
    inline def setCurrentDeliveryStreamVersionId(value: DeliveryStreamVersionId): Self = StObject.set(x, "CurrentDeliveryStreamVersionId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setDestinationId(value: DestinationId): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchDestinationUpdate(value: ElasticsearchDestinationUpdate): Self = StObject.set(x, "ElasticsearchDestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchDestinationUpdateUndefined: Self = StObject.set(x, "ElasticsearchDestinationUpdate", js.undefined)
    
    inline def setExtendedS3DestinationUpdate(value: ExtendedS3DestinationUpdate): Self = StObject.set(x, "ExtendedS3DestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setExtendedS3DestinationUpdateUndefined: Self = StObject.set(x, "ExtendedS3DestinationUpdate", js.undefined)
    
    inline def setHttpEndpointDestinationUpdate(value: HttpEndpointDestinationUpdate): Self = StObject.set(x, "HttpEndpointDestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointDestinationUpdateUndefined: Self = StObject.set(x, "HttpEndpointDestinationUpdate", js.undefined)
    
    inline def setRedshiftDestinationUpdate(value: RedshiftDestinationUpdate): Self = StObject.set(x, "RedshiftDestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setRedshiftDestinationUpdateUndefined: Self = StObject.set(x, "RedshiftDestinationUpdate", js.undefined)
    
    inline def setS3DestinationUpdate(value: S3DestinationUpdate): Self = StObject.set(x, "S3DestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUpdateUndefined: Self = StObject.set(x, "S3DestinationUpdate", js.undefined)
    
    inline def setSplunkDestinationUpdate(value: SplunkDestinationUpdate): Self = StObject.set(x, "SplunkDestinationUpdate", value.asInstanceOf[js.Any])
    
    inline def setSplunkDestinationUpdateUndefined: Self = StObject.set(x, "SplunkDestinationUpdate", js.undefined)
  }
}
