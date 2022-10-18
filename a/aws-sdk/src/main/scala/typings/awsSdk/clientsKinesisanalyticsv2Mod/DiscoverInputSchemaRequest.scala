package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverInputSchemaRequest extends StObject {
  
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfiguration] = js.undefined
  
  /**
    * The point at which you want Kinesis Data Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN] = js.undefined
  
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.S3Configuration] = js.undefined
  
  /**
    * The ARN of the role that is used to access the streaming source.
    */
  var ServiceExecutionRole: RoleARN
}
object DiscoverInputSchemaRequest {
  
  inline def apply(ServiceExecutionRole: RoleARN): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal(ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInputSchemaRequest]
  }
  
  extension [Self <: DiscoverInputSchemaRequest](x: Self) {
    
    inline def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = StObject.set(x, "InputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "InputProcessingConfiguration", js.undefined)
    
    inline def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputStartingPositionConfigurationUndefined: Self = StObject.set(x, "InputStartingPositionConfiguration", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
    
    inline def setServiceExecutionRole(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRole", value.asInstanceOf[js.Any])
  }
}
