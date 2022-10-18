package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationVpcConfigurationRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * A value you use to implement strong concurrency for application updates. You must provide the CurrentApplicationVersionId or the ConditionalToken. You get the application's current ConditionalToken using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var ConditionalToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConditionalToken] = js.undefined
  
  /**
    * The current application version ID. You must provide the CurrentApplicationVersionId or the ConditionalToken. You can retrieve the application version ID using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  
  /**
    * The ID of the VPC configuration to delete.
    */
  var VpcConfigurationId: Id
}
object DeleteApplicationVpcConfigurationRequest {
  
  inline def apply(ApplicationName: ApplicationName, VpcConfigurationId: Id): DeleteApplicationVpcConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVpcConfigurationRequest]
  }
  
  extension [Self <: DeleteApplicationVpcConfigurationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setConditionalToken(value: ConditionalToken): Self = StObject.set(x, "ConditionalToken", value.asInstanceOf[js.Any])
    
    inline def setConditionalTokenUndefined: Self = StObject.set(x, "ConditionalToken", js.undefined)
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionIdUndefined: Self = StObject.set(x, "CurrentApplicationVersionId", js.undefined)
    
    inline def setVpcConfigurationId(value: Id): Self = StObject.set(x, "VpcConfigurationId", value.asInstanceOf[js.Any])
  }
}
