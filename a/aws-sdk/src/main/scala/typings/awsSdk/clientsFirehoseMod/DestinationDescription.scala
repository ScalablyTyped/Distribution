package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationDescription extends StObject {
  
  var AmazonopensearchserviceDestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.AmazonopensearchserviceDestinationDescription] = js.undefined
  
  /**
    * The ID of the destination.
    */
  var DestinationId: typings.awsSdk.clientsFirehoseMod.DestinationId
  
  /**
    * The destination in Amazon ES.
    */
  var ElasticsearchDestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ElasticsearchDestinationDescription] = js.undefined
  
  /**
    * The destination in Amazon S3.
    */
  var ExtendedS3DestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ExtendedS3DestinationDescription] = js.undefined
  
  /**
    * Describes the specified HTTP endpoint destination.
    */
  var HttpEndpointDestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.HttpEndpointDestinationDescription] = js.undefined
  
  /**
    * The destination in Amazon Redshift.
    */
  var RedshiftDestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RedshiftDestinationDescription] = js.undefined
  
  /**
    * [Deprecated] The destination in Amazon S3.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.S3DestinationDescription] = js.undefined
  
  /**
    * The destination in Splunk.
    */
  var SplunkDestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.SplunkDestinationDescription] = js.undefined
}
object DestinationDescription {
  
  inline def apply(DestinationId: DestinationId): DestinationDescription = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationDescription] (val x: Self) extends AnyVal {
    
    inline def setAmazonopensearchserviceDestinationDescription(value: AmazonopensearchserviceDestinationDescription): Self = StObject.set(x, "AmazonopensearchserviceDestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setAmazonopensearchserviceDestinationDescriptionUndefined: Self = StObject.set(x, "AmazonopensearchserviceDestinationDescription", js.undefined)
    
    inline def setDestinationId(value: DestinationId): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchDestinationDescription(value: ElasticsearchDestinationDescription): Self = StObject.set(x, "ElasticsearchDestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchDestinationDescriptionUndefined: Self = StObject.set(x, "ElasticsearchDestinationDescription", js.undefined)
    
    inline def setExtendedS3DestinationDescription(value: ExtendedS3DestinationDescription): Self = StObject.set(x, "ExtendedS3DestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setExtendedS3DestinationDescriptionUndefined: Self = StObject.set(x, "ExtendedS3DestinationDescription", js.undefined)
    
    inline def setHttpEndpointDestinationDescription(value: HttpEndpointDestinationDescription): Self = StObject.set(x, "HttpEndpointDestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointDestinationDescriptionUndefined: Self = StObject.set(x, "HttpEndpointDestinationDescription", js.undefined)
    
    inline def setRedshiftDestinationDescription(value: RedshiftDestinationDescription): Self = StObject.set(x, "RedshiftDestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setRedshiftDestinationDescriptionUndefined: Self = StObject.set(x, "RedshiftDestinationDescription", js.undefined)
    
    inline def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationDescriptionUndefined: Self = StObject.set(x, "S3DestinationDescription", js.undefined)
    
    inline def setSplunkDestinationDescription(value: SplunkDestinationDescription): Self = StObject.set(x, "SplunkDestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setSplunkDestinationDescriptionUndefined: Self = StObject.set(x, "SplunkDestinationDescription", js.undefined)
  }
}
